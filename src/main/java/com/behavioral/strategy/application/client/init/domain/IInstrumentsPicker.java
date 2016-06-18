package com.behavioral.strategy.application.client.init.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.behavioral.strategy.application.client.init.instrument.IInstrumentFilter;
import com.behavioral.strategy.application.client.init.utils.InstrumentUtils;



/**
 * 股票池<br>
 * Created by yujianming on 2016/1/28.
 */
public class IInstrumentsPicker {
	
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(IInstrumentsPicker.class);

    /**
     * 存储选股信息，key股票代码，value为股票实体
     */
    private Map<String, Instrument> universe = new HashMap<String, Instrument>();

    private Instrument benchmark;

    public Map<String, Instrument> getUniverse() {
        return universe;
    }

    //当前选股时间
    private Date date;

    public void setUniverse(Map<String, Instrument> universe) {
        this.universe = universe;
    }

    /**
     * 增加选股
     * @param idOrSymbol
     * @returnt
     */
    public IInstrumentsPicker add(String... idOrSymbol){
        for (String value : idOrSymbol) {
            Instrument instrument = InstrumentUtils.getInstrument(value.trim(), date);

            if(instrument != null ){
                if(universe.get(instrument.getOrderBookID()) == null){
                   universe.put(instrument.getOrderBookID(), instrument);
                }
            }
        }
        return this;
    }
    
    
    public IInstrumentsPicker addBenchmark(String benchmark){

        return this;
    }

    public IInstrumentsPicker add(Instrument[] instruments){
        if(instruments != null){
            for (Instrument instrument: instruments ) {
                if(instrument != null && instrument.getId() != null ){
                    universe.put(instrument.getOrderBookID(), instrument);
                }
            }
        }

        return this;
    }

    public IInstrumentsPicker add(Instrument instrument) {
        if(instrument != null && instrument.getId() != null ){
            universe.put(instrument.getOrderBookID(), instrument);
        }
        return this;
    }

    //添加所有股票到股票池中
    public IInstrumentsPicker all(){
        List<Instrument> list = InstrumentUtils.getAllInstrument(date);
        this.add(list.toArray(new Instrument[list.size()]));
        //把所有股票加进股票池中
        return this;
    }

    public IInstrumentsPicker remove(String... idOrSymbol){
        for (String id : idOrSymbol) {
            Instrument instrument = InstrumentUtils.getInstrument(id, date);
            if(instrument != null) {
                universe.remove(instrument.getOrderBookID());
            }
        }
        return this;
    }   

    public IInstrumentsPicker remove(Instrument[] instruments){
        for (Instrument instrument : instruments) {
            if(instrument != null && instrument.getOrderBookID() != null){
                this.universe.remove(instrument.getOrderBookID());
            }
        }
        return this;
    }

    public IInstrumentsPicker filter(IInstrumentFilter filter){
        List<Instrument> removeList = new ArrayList<>();
        for(Instrument instrument : this.universe.values()){
            if(!filter.filter(instrument)){
                removeList.add(instrument);
            }
        }
        for(Instrument instrument : removeList){
            this.universe.remove(instrument.getOrderBookID());
        }
        return this;
    }

    //获得所有的所选股票信息
    public Instrument[] list(){
        return this.universe.values().toArray(new Instrument[this.universe.values().size()]);
    }

    public List<String> toOrderBookIDList(){
        return new ArrayList<>(this.universe.keySet());
    }

    public List<String> toSearchStatsList(){
        List<String> result = new ArrayList<>(this.universe.keySet());
        if(this.benchmark == null){
            this.addBenchmark("399300.SZ");
        }
        result.add(this.benchmark.getOrderBookId());
        return result;
    }

    public String[] toOrderBookIDArray(){
        return this.universe.keySet().toArray(new String[universe.keySet().size()]);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
