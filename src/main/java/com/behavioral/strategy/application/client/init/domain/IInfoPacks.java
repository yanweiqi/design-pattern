package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 回测时的持仓信息 <br>
 * Created by yujianming on 2016/1/27.
 */
public class IInfoPacks implements Serializable {

	private static final long serialVersionUID = -3185561447321146953L;
	
	/**
	 * 时间
	 */
    private IRuntime runtime = new IRuntime();
    
    /**
     * 持仓资产信息
     */
    private IPortfolio portfolio;
    
    /**
     * 持仓股票信息
     */
    private Map<String, IPosition> positionMap = new HashMap<String, IPosition>();
        
    /**
     * 所选股票池的基本信息
     */
    private Map<String, Instrument> instrumentMap;
    
    /**
     * 所有未成交的限价单
     */
    private List<TransactionDetail> transactionDetails = new ArrayList<TransactionDetail>();

    /**
     * 用户交易参数
     */
    private TransactionParam  transactionParam = new TransactionParam();

    /**
     * 是否运行，程序被中断的关键字段
     */
    private Boolean isRunning = true;

    public IRuntime getRuntime() {
        return runtime;
    }

    public void setRuntime(IRuntime runtime) {
        this.runtime = runtime;
    }

    public IPortfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(IPortfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Map<String, IPosition> getPositionMap() {
        return positionMap;
    }

    public void setPositionMap(Map<String, IPosition> positionMap) {
        this.positionMap = positionMap;
    }

    public Map<String, Instrument> getInstrumentMap() {
        return instrumentMap;
    }

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }

    public IRuntime runtime(){
        return this.runtime;
    }

    public IPosition position(String id){
        IPosition position = positionMap.get(id);
        if(position == null){
            position = new IPosition();
        }
        return position;
    }

    public IPortfolio portfolio(){
        return this.portfolio;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    public TransactionDetail[] transactionDetails() {
        if(this.transactionDetails != null && this.transactionDetails.size() > 0){
            return this.transactionDetails.toArray(new TransactionDetail[this.transactionDetails.size()]);
        }
        return new TransactionDetail[]{};
    }

    public List<TransactionDetail> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(List<TransactionDetail> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public TransactionParam getTransactionParam() {
        return transactionParam;
    }

    public void setTransactionParam(TransactionParam transactionParam) {
        this.transactionParam = transactionParam;
    }
}
