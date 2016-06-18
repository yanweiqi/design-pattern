package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 缓存起来的交易内容
 * 目前用来计算vwap和mavg<br>
 * Created by yujianming on 2016/3/21.
 */
public class StatisticsParam  implements Serializable {
	

	private static final long serialVersionUID = 3108883502856673299L;

	/**
	 * 收盘价
	 */
    private BigDecimal closingPrice = BigDecimal.ZERO;
    
    /**
     * 返回当日总交易的股数。
     */
    private double turnoverVolume;
    
    /**
     * 返回当日总交易的股数。
     */
    private BigDecimal turnover = BigDecimal.ZERO;

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getTurnoverVolume() {
        return turnoverVolume;
    }

    public void setTurnoverVolume(double turnoverVolume) {
        this.turnoverVolume = turnoverVolume;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }
}
