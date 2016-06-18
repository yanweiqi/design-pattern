package com.behavioral.strategy.application.client.init.utils;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.behavioral.strategy.application.client.init.domain.Instrument;
import com.behavioral.strategy.application.client.init.domain.SectorCode;

/**
 * Created by yujianming on 2016/4/10.<br>
 * 股票工具类
 */
public class InstrumentUtils {

    private static final Log log = LogFactory.getLog(InstrumentUtils.class);


    /**
     * 存储所有股票对象，key以两种方式存储，分别是股票编号、股票名称。value值为股票实体
     */
    private static Map<String, List<Instrument>> instruments = null;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    /**
     * 存储板块股票，key为板块名称
     */
    private static Map<String, List<Instrument>> sectorMap = new HashMap<String, List<Instrument>>();

    /**
     * 存储行业股票，key为行业名称
     */
    private static Map<String, List<Instrument>> industryMap = new HashMap<String, List<Instrument>>();

    public static Instrument getInstrument(String symbolOrId, Date date){
        if(instruments == null){
            init();
            if(instruments == null){
                return null;
            }
        }
        List<Instrument> list = instruments.get(symbolOrId);
        if(list == null){
//            log.error("内存中不包含股票："+symbolOrId + "   " + DateUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss"));
            return null;
        }

        for(Instrument instrument : list){
            Integer searchDate = Integer.parseInt(sdf.format(date));
            if(instrument.getsInfoDelistdate() != null && instrument.getsInfoDelistdate() != 0 && instrument.getsInfoDelistdate() < searchDate){
                //如果当前查询时间大于退市时间，则返回该股票不存在
                log.error("股票已经退市："+symbolOrId + "   " + DateUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss"));
                return null;
            }
            if(instrument.getEnddate() == null || instrument.getEnddate() == 0){
                if(instrument.getBegindate() <= searchDate){
                    return instrument;
                }
            }
            if(instrument.getBegindate() <= searchDate && searchDate <= instrument.getEnddate()){
                return instrument;
            }
        }

        log.error("没查询到股票："+symbolOrId + "   " + DateUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss"));
        return null;
    }

    public static List<Instrument> getAllInstrument(Date date){
        if(instruments == null){
            init();
        }
        if(instruments == null){
            return null;
        }

        List<Instrument> result = new ArrayList<>();
        Set<String> keys = instruments.keySet();
        for(String key : keys){
            //代表key是orderBookId。过滤掉股票名称为key的情况
            if(key.contains(".") && !key.startsWith("1") && !key.startsWith("5")){
                Instrument instrument = getInstrument(key, date);
                if(instrument != null){
                    result.add(instrument);
                }
            }
        }
        return result;
    }

    /**
     * 根据板块选股
     * @param sectors
     * @return
     */
    public static List<Instrument> getSectorInstruments(String... sectors){
        if(instruments == null){
            init();
        }
        if(instruments == null){
            return null;
        }
        List<Instrument> list = new ArrayList<Instrument>();
        for(String sector : sectors){
            if(sectorMap.containsKey(sector)){
                list.addAll(sectorMap.get(sector));
            }
        }
        return list;
    }

    /**
     * 根据板块选股
     * @param sectors
     * @return
     */
    public static List<Instrument> getSectorInstruments(SectorCode... sectors){
        if(instruments == null){
            init();
        }
        if(instruments == null){
            return null;
        }
        List<Instrument> list = new ArrayList<Instrument>();
        for(SectorCode sector : sectors){
            if(sectorMap.containsKey(sector.getCode())){
                list.addAll(sectorMap.get(sector.getCode()));
            }
        }
        return list;
    }

    /**
     * 根据行业选股
     * @param industrys
     * @return
     */
    public static List<Instrument> getIndustryInstruments(String... industrys){
        if(instruments == null){
            init();
        }
        if(instruments == null){
            return null;
        }
        List<Instrument> list = new ArrayList<Instrument>();
        for(String industry : industrys){
            if(industryMap.containsKey(industry)){
                list.addAll(industryMap.get(industry));
            }
        }
        return list;
    }

    /**
     * 初始化股票
     */
    public synchronized static void init(){
        try{
            instruments = new HashMap<String, List<Instrument>>();
           // DatabaseOperateRPC databaseOperateRPC = (DatabaseOperateRPC) BeanFactoryUtil.getBean("databaseOperateRPC");

            List<Instrument> list = null;//databaseOperateRPC.findInstrumentList(null);

            for(Instrument instrument : list){
                addOrderBookIdList(instrument);
                addSymbolList(instrument);
            }
            //初始化板块、行业信息
            initSectorAndIndustry(list);
        }catch (Exception e){
            log.error("", e);
        }
    }

    /**
     * 根据orderBookId添加
     * @param instrument
     */
    private static void addOrderBookIdList(Instrument instrument){
        List<Instrument> instrumentsList = instruments.get(instrument.getOrderBookID());
        if(instrumentsList == null){
            instrumentsList = new ArrayList<>();
            instruments.put(instrument.getOrderBookID().trim(), instrumentsList);
        }
        instrumentsList.add(instrument);
    }

    /**
     * 根据股票名称添加
     * @param instrument
     */
    private static void addSymbolList(Instrument instrument){
        List<Instrument> instrumentsList = instruments.get(instrument.getSymbol());
        if(instrumentsList == null){
            instrumentsList = new ArrayList<>();
            instruments.put(instrument.getSymbol().trim(), instrumentsList);
        }
        instrumentsList.add(instrument);
    }



    private static void initSectorAndIndustry(List<Instrument> list){
        Map<String, List<Instrument>> sectorTemp = new HashMap<>();
        Map<String, List<Instrument>> industryTemp = new HashMap<>();
        for(Instrument instrument : list){
            if(instrument.getEnddate() == null || instrument.getEnddate() == 0){
                //添加板块股票信息
                List<Instrument> sectorInstruments = sectorTemp.get(instrument.getSectorCode());
                if(sectorInstruments == null){
                    sectorInstruments = new ArrayList<>();
                    sectorTemp.put(instrument.getSectorCode(), sectorInstruments);
                    sectorTemp.put(instrument.getSectorName(), sectorInstruments);
                }
                sectorInstruments.add(instrument);

                //添加行业股票信息
                List<Instrument> industryInstruments = industryTemp.get(instrument.getIndustryCode());
                if(industryInstruments == null){
                    industryInstruments = new ArrayList<>();
                    industryTemp.put(instrument.getIndustryCode(), industryInstruments);
                    industryTemp.put(instrument.getIndustryName(), industryInstruments);
                }
                industryInstruments.add(instrument);

            }
        }

        for(String key : sectorTemp.keySet()){
            sectorMap.put(key, sectorTemp.get(key));
        }
        for(String key : industryTemp.keySet()){
            industryMap.put(key, industryTemp.get(key));
        }
    }


    //实时数据查询结果为空，需要自己创建一个对象
    public static Instrument createDefaultInstrument(String orderBookID) {
        Instrument instrument = new Instrument();
        instrument.setOrderBookId(orderBookID);
        instrument.setSymbol(orderBookID);
        instrument.setRoundLot(100);
        return instrument;
    }
}
