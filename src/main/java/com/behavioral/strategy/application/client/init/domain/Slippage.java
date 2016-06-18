package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yujianming on 2016/2/3.<br>
 * 滑点类
 */
public class Slippage implements Serializable{
	
	private static final long serialVersionUID = 7093761259720201265L;
	
	private BigDecimal percent = new BigDecimal("0.002");

    public Slippage(){}

    public Slippage(String percent){
        this.percent = new BigDecimal(percent);
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public void percent(double percent){
        this.percent = new BigDecimal(String.valueOf(percent)).divide(new BigDecimal(100));
    }
}
