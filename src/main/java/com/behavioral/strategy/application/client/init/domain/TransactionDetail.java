package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yujianming on 2016/1/28.
 */
public class TransactionDetail  implements Serializable {

	private static final long serialVersionUID = -1868627612367755812L;
	//股票代码
    private Instrument instrument;
    //类型: 买入、卖出
    private String orderType;
    //成交数量
    private BigDecimal count = BigDecimal.ZERO;
    //购买数量
    private BigDecimal buyCount = BigDecimal.ZERO;
    //成交价
    private BigDecimal price = BigDecimal.ZERO;
    //印花税
    private BigDecimal tax = BigDecimal.ZERO;
    //滑点费
    private BigDecimal slippagePrice = BigDecimal.ZERO;
    //总成本
    private BigDecimal totle = BigDecimal.ZERO;
    //交易佣金、手续费
    private BigDecimal commission = BigDecimal.ZERO;
    //交易时间
    private Date date;
    //交易成功标示，flag = true 标示交易成功
    private boolean flag = false;
    //交易失败原因。flag = false 时，此值有值
    private String message;
    //订单号
    private Long orderId;
    //交易类型，1是市价单，2是限价单
    private Integer orderStyle = 1;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotle() {
        return totle;
    }

    public void setTotle(BigDecimal totle) {
        this.totle = totle;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(BigDecimal buyCount) {
        this.buyCount = buyCount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getSlippagePrice() {
        return slippagePrice;
    }

    public void setSlippagePrice(BigDecimal slippagePrice) {
        this.slippagePrice = slippagePrice;
    }

    public Integer getOrderStyle() {
        return orderStyle;
    }

    public void setOrderStyle(Integer orderStyle) {
        this.orderStyle = orderStyle;
    }
}
