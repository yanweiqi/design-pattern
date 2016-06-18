package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * 交易详情
 * Created by yujianming on 2016/1/24.
 */
public class Statistics  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 853977968500678319L;
	//时间？
    private Date date;
    //前一天的收盘价
    private BigDecimal frontClosingPrice = BigDecimal.ZERO;
    //开盘价
    private BigDecimal openingPrice = BigDecimal.ZERO;
    //返回当前最高成交价。
    private BigDecimal highPrice = BigDecimal.ZERO;
    //返回当前最低成交价。
    private BigDecimal lowPrice = BigDecimal.ZERO;
    //收盘价
    private BigDecimal closingPrice = BigDecimal.ZERO;
    //返回当日总交易的股数。
    private double turnoverVolume;
    //返回当日成交金额
    private BigDecimal turnover = BigDecimal.ZERO;
    //涨跌(元)
    private BigDecimal profitPrice = BigDecimal.ZERO;
    //涨跌幅度 %
    private BigDecimal profitRange = BigDecimal.ZERO;
    //均价
    private BigDecimal averagePrice = BigDecimal.ZERO;
    //换手率
    private BigDecimal turnoverRate = BigDecimal.ZERO;
    //返回最新的成交价。
    private BigDecimal lastPrice = BigDecimal.ZERO;

    private String orderBookID;

    private Instrument instrument;

    private Integer sf;

    //前一天的收盘价
    private BigDecimal preClosePrice = BigDecimal.ZERO;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getFrontClosingPrice() {
        return frontClosingPrice;
    }

    public void setFrontClosingPrice(BigDecimal frontClosingPrice) {
        this.frontClosingPrice = frontClosingPrice;
    }

    public BigDecimal getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(BigDecimal openingPrice) {
        this.openingPrice = openingPrice;
    }

    public BigDecimal getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(BigDecimal highPrice) {
        this.highPrice = highPrice;
    }

    public BigDecimal getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(BigDecimal lowPrice) {
        this.lowPrice = lowPrice;
    }

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

    public BigDecimal getProfitPrice() {
        return profitPrice;
    }

    public void setProfitPrice(BigDecimal profitPrice) {
        this.profitPrice = profitPrice;
    }

    public BigDecimal getProfitRange() {
        return profitRange;
    }

    public void setProfitRange(BigDecimal profitRange) {
        this.profitRange = profitRange;
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    public BigDecimal getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(BigDecimal turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getOrderBookID() {
        return orderBookID;
    }

    public void setOrderBookID(String orderBookID) {
        this.orderBookID = orderBookID;
    }

    public Integer getSf() {
        return sf;
    }

    public void setSf(Integer sf) {
        this.sf = sf;
    }

    private StatisticsParam getStatisticsParam(){
        StatisticsParam statisticsParam = new StatisticsParam();
        statisticsParam.setTurnover(this.getTurnover());
        statisticsParam.setTurnoverVolume(this.getTurnoverVolume());
        statisticsParam.setClosingPrice(this.getClosingPrice());
        return statisticsParam;
    }

    public BigDecimal getPreClosePrice() {
        return preClosePrice;
    }

    public void setPreClosePrice(BigDecimal preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    public void setPre_close(BigDecimal preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("date").append("=").append(date).append(";");
        sb.append("frontClosingPrice").append(frontClosingPrice).append(";");
        sb.append("frontClosingPrice").append("=").append(frontClosingPrice).append(";");
        sb.append("openingPrice").append("=").append(openingPrice).append(";");
        sb.append("highPrice").append("=").append(highPrice).append(";");
        sb.append("lowPrice").append("=").append(lowPrice).append(";");
        sb.append("closingPrice").append("=").append(closingPrice).append(";");
        sb.append("turnoverVolume").append("=").append(turnoverVolume).append(";");
        sb.append("turnover").append("=").append(turnover).append(";");
        sb.append("profitPrice").append("=").append(profitPrice).append(";");
        sb.append("profitRange").append("=").append(profitRange).append(";");
        sb.append("averagePrice").append("=").append(averagePrice).append(";");
        sb.append("turnoverRate").append("=").append(turnoverRate).append(";");
        sb.append("lastPrice").append("=").append(lastPrice).append(";");
        sb.append("orderBookID").append("=").append(orderBookID).append(";");
        sb.append("preClosePrice").append("=").append(preClosePrice).append(";");
        return sb.toString();
    }

}
