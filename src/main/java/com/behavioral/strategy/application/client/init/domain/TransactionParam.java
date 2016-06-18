package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yujianming on 2016/2/25.<br>
 * 交易参数
 */
public class TransactionParam  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//默认一个基准，沪深300
    private String benchmark = "399300.SZ";
    
    //滑点
    private Slippage slippage = new Slippage("0.002");
    
    //手续费
    private Commission commission = new Commission("0.00025");
    
    //默认印花税
    private BigDecimal taxPercent = new BigDecimal("0.001");

    private QuantaTaskRequest taskRequest ;

    public String getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(String benchmark) {
        this.benchmark = benchmark;
    }

    public Slippage getSlippage() {
        return slippage;
    }

    public void setSlippage(Slippage slippage) {
        this.slippage = slippage;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

    public QuantaTaskRequest getTaskRequest() {
        return taskRequest;
    }

    public void setTaskRequest(QuantaTaskRequest taskRequest) {
        this.taskRequest = taskRequest;
    }
}
