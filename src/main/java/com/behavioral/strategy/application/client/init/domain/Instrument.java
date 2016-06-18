package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 股票类，包含了关于某一个股票的静态信息，例如股票代码、股票名称、上市日期等<br>
 * Created by yujianming on 2016/1/24.
 */
public class Instrument implements Serializable {

	private static final long serialVersionUID = 3733042630906496240L;
	
	private Integer id;
	
    //股票标识,股票编号
    private String orderBookId;
    
    //股票名称
    private String symbol;

    //返回股票名称的简称。在中国市场，这个字段绝大部分时候是股票名称的拼音首字母。例如“上海石化” 的简称是“SHSH”，“连云港”则简称为“LYG”。
    private String abbrevSymbol;

    //返回股票每手的数量。在上海及深圳证券交易所，这个数总是100。
    private double roundLot = 100d;

    //板块代码
    private String sectorCode;
    
    //板块中文名称
    private String sectorName;
    
    //行业代码
    private String industryCode;
    
    //行业中文名称
    private String industryName;

    //起始日期
    private Integer begindate;
    
    //截止日期
    private Integer enddate;
    
    //1：表示st
    private Integer stStock;
    
    //上市日期
    private Integer listedDate;
    
    //退市日期
    private Integer sInfoDelistdate;
    
    //生成instrument的当前时间
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBegindate() {
        return begindate;
    }

    public void setBegindate(Integer begindate) {
        this.begindate = begindate;
    }

    public Integer getEnddate() {
        return enddate;
    }

    public void setEnddate(Integer enddate) {
        this.enddate = enddate;
    }

    public Integer getStStock() {
        return stStock;
    }

    public void setStStock(Integer stStock) {
        this.stStock = stStock;
    }

    public Integer getListedDate() {
        return listedDate;
    }

    public void setListedDate(Integer listedDate) {
        this.listedDate = listedDate;
    }

    public Integer getsInfoDelistdate() {
        return sInfoDelistdate;
    }

    public void setsInfoDelistdate(Integer sInfoDelistdate) {
        this.sInfoDelistdate = sInfoDelistdate;
    }

    public String getOrderBookID() {
        return orderBookId;
    }

    public String getOrderBookId() {
        return orderBookId;
    }

    public void setOrderBookId(String orderBookId) {
        this.orderBookId = orderBookId;
    }

    public void setOrderBookID(String orderBookId) {
        this.orderBookId = orderBookId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAbbrevSymbol() {
        return abbrevSymbol;
    }

    public void setAbbrevSymbol(String abbrevSymbol) {
        this.abbrevSymbol = abbrevSymbol;
    }

    public double getRoundLot() {
        return roundLot;
    }

    public void setRoundLot(double roundLot) {
        this.roundLot = roundLot;
    }

    public String getSectorCode() {
        return sectorCode;
    }

    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("orderBookId").append("=").append(orderBookId).append(",");
        sb.append("symbol").append("=").append(symbol).append(",");
        sb.append("stStock").append("=").append(stStock!= null && stStock==1?"是":"不是");
        return sb.toString();
    }

}
