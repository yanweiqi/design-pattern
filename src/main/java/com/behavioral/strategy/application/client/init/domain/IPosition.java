package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.behavioral.strategy.application.client.init.utils.BigDecimalUtils;

/**
 * 投资策略组合的每个股票的持仓情况<br>
 * Created by yujianming on 2016/1/24.
 */
public class IPosition implements Serializable {

	private static final long serialVersionUID = 222582000903576548L;
	private Instrument instrument;                                      //股票静态信息
    private BigDecimal boughtQuantity = BigDecimal.ZERO;                //获得总共买入成交的股数
    private BigDecimal soldQuantity = BigDecimal.ZERO;                  //获得总共的卖出成交的股数
    private BigDecimal boughtValue = BigDecimal.ZERO;                   //获得已买成交的总值
    private BigDecimal soldValue = BigDecimal.ZERO;                     //获得已卖成交的总值
    private BigDecimal nonClosedTradeQuantity = BigDecimal.ZERO;        //获得总未平仓的交易股数
    private BigDecimal totalOrders = BigDecimal.ZERO;                   //获得该持仓的所有的落单数目。
    private BigDecimal totalTrades = BigDecimal.ZERO;                   //获得该持仓的所有成交单数目。
    private BigDecimal totalCommission = BigDecimal.ZERO;               //累计手续费
    private BigDecimal totalProfitAndLoss = BigDecimal.ZERO;            //个股总盈亏
    private BigDecimal closingPrice = BigDecimal.ZERO;                  //收盘价
    private BigDecimal canSellSharesNum = BigDecimal.ZERO;              //可以卖出的股票数量


    /**
     * 例如：“如果您的投资组合没有任何000001.XSHE的买单成交，那么这个方法将会返回0”。
     * @return 总共买入成交的股数
     */
    public double getBoughtQuantityValue(){
        return BigDecimalUtils.doubleValue(boughtQuantity);
    }
    
    /**
     * 例如：“如果您的投资组合有000001.XSHE200股数的卖出成交记录，和100股数的买入成交记录，那么这个方法将会返回200”。
     * @return 总共的卖出成交的股数
     */
    public double getSoldQuantityValue(){
        return BigDecimalUtils.doubleValue(soldQuantity);
    }
    
    /**
     * 它等于每一笔的买入成交的“成交价 * 成交股数”的和，总为正值
     * @return 已买成交的总值
     */
    public double getBoughtValueMoney(){
        return BigDecimalUtils.doubleValue(boughtValue);
    }
    
    /**
     * 和上面类似，它等于每一笔的卖出成交的“成交价 * 成交股数”的和，总为正值。
     * @return 已卖成交的总值
     */
    public double getSoldValueMoney(){
        return BigDecimalUtils.doubleValue(soldValue);
    }
    
    /**
     * “你的投资组合拥有400股买入成交和100股卖出成交的000001.XSHE，那么这个方法将会返回300告诉你该持有股还有300股未被平仓”。
     * @return 总未平仓的交易股数，
     */
    public double getNonClosedTradeQuantityValue(){
        return BigDecimalUtils.doubleValue(nonClosedTradeQuantity);
    }
    
    /**
     * 
     * @return 该持仓的所有的落单数目
     */
    public double getTotalOrdersValue(){
        return BigDecimalUtils.doubleValue(totalOrders);
    }
    
    /**
     * 
     * @return 该持仓的所有成交单数目。
     */
    public double getTotalTradesValue(){
        return BigDecimalUtils.doubleValue(totalTrades);
    }
    
    
    public double getTotalCommissionValue(){
        return BigDecimalUtils.doubleValue(totalCommission);
    }
    
    
    public double getTotalProfitAndLossValue(){
        return BigDecimalUtils.doubleValue(totalProfitAndLoss);
    }
    
    
    public double getClosingPriceValue(){
        return BigDecimalUtils.doubleValue(closingPrice);
    }
    public double getCanSellSharesNumValue(){
        return BigDecimalUtils.doubleValue(canSellSharesNum);
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getTotalProfitAndLoss() {
        return totalProfitAndLoss;
    }

    public void setTotalProfitAndLoss(BigDecimal totalProfitAndLoss) {
        this.totalProfitAndLoss = totalProfitAndLoss;
    }

    public BigDecimal getBoughtValue() {
        return boughtValue;
    }

    public void setBoughtValue(BigDecimal boughtValue) {
        this.boughtValue = boughtValue;
    }

    public BigDecimal getSoldValue() {
        return soldValue;
    }

    public void setSoldValue(BigDecimal soldValue) {
        this.soldValue = soldValue;
    }

    public BigDecimal getBoughtQuantity() {
        return boughtQuantity;
    }

    public void setBoughtQuantity(BigDecimal boughtQuantity) {
        this.boughtQuantity = boughtQuantity;
    }

    public BigDecimal getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(BigDecimal soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public BigDecimal getNonClosedTradeQuantity() {
        return nonClosedTradeQuantity;
    }

    public void setNonClosedTradeQuantity(BigDecimal nonClosedTradeQuantity) {
        this.nonClosedTradeQuantity = nonClosedTradeQuantity;
    }

    public BigDecimal getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(BigDecimal totalOrders) {
        this.totalOrders = totalOrders;
    }

    public BigDecimal getTotalTrades() {
        return totalTrades;
    }

    public void setTotalTrades(BigDecimal totalTrades) {
        this.totalTrades = totalTrades;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public BigDecimal getCanSellSharesNum() {
        return canSellSharesNum;
    }

    public void setCanSellSharesNum(BigDecimal canSellSharesNum) {
        this.canSellSharesNum = canSellSharesNum;
    }
}
