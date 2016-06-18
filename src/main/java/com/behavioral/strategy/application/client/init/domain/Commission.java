package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yujianming on 2016/2/3.<br>
 * 券商手续费实体
 */
public class Commission  implements Serializable {
	
	private static final long serialVersionUID = 6483629274986474035L;
	
	private BigDecimal percent = new BigDecimal("0.00025");

    public Commission(){}

    public Commission(String percent){
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
