package com.behavioral.strategy.application.client.init.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.behavioral.strategy.application.client.init.utils.DateUtils;


/**
 * 启动回归测试任务时传递的参数对象 <br>
 * Created by sunguowei on 2016-1-29.
 */
public class QuantaTaskRequest implements Serializable{

	private static final long serialVersionUID = -6483485494473997876L;
	/**
     * 历史回测
     */
    public static final Integer TASK_TYPE_REGRESSION = 1;
    /**
     * 实盘模拟
     */
    public static final Integer TASK_TYPE_SIMULATE = 2;
    /**
     * 竞赛-模拟
     */
    public static final Integer TASK_TYPE_CONTEST_SIM = 3;
    /**
     * 竞赛-回测
     */
    public static final Integer TASK_TYPE_CONTEST_REG = 4;

    /**
     * 用户id
     */
    private String userPin;
    /**
     * 策略名
     */
    private String strategyName;

    /**
     * 策略id
     */
    private Long strategyId;

    /**
     * 源代码
     */
    private String sourceCode;
    /**
     * 策略语言类型
     */
    private String languageType;

    /**
     * 源代码版本号
     */
    private Integer version;

    /**
     * 回测起始时间点
     */
    private Date startDate;
    /**
     * 回测结束时间点
     */
    private Date endDate;

    /**
     * 初始回测资金
     */
    private BigDecimal initialCash;
    /**
     * 回测任务类型
     */
    private String regressionType;

    /**
    * 运行开始时间
    */
    private Date runStartDate;

    /**
     * 最后运行时间
     */
    private Date lastRunTime;

    /**
     * 用户访问时间。用户pin+策略id+requestTime
     */
    private Long requestTime;

    /**
     * 任务类型：1、回测，2模拟 3竞赛模拟，4竞赛回测
     */
    private Integer strategyType;

    private boolean encrypted = false;
    private boolean strategyFromCache = false;

    /**
     * 模拟运行是否初次启动
     */
    private boolean isFirstRun = false;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return 返回回测任务类型
     */
    public String getRegressionType() {
        return regressionType;
    }

    public void setRegressionType(String regressionType) {
        this.regressionType = regressionType;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    public BigDecimal getInitialCash() {
        return initialCash;
    }

    public void setInitialCash(BigDecimal initialCash) {
        this.initialCash = initialCash;
    }

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getRunStartDate() {
        return runStartDate;
    }

    public void setRunStartDate(Date runStartDate) {
        this.runStartDate = runStartDate;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Date getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    public boolean isStrategyFromCache() {
        return strategyFromCache;
    }

    public void setStrategyFromCache(boolean strategyFromCache) {
        this.strategyFromCache = strategyFromCache;
    }

    public boolean isFirstRun() {
        return isFirstRun;
    }

    public void setFirstRun(boolean firstRun) {
        isFirstRun = firstRun;
    }

    public String taskSummary() {
        return  "startDate=" + DateUtils.format(startDate,"yyyyMMddHHmmss")
                + ";endDate=" + DateUtils.format(endDate,"yyyyMMddHHmmss")
                + ";strategyId=" + strategyId
                + ";strategyName=" + strategyName
                + ";requestTime=" + requestTime
                + ";userPin=" + userPin
                + ";languageType=" + languageType
                + ";initialCash=" + initialCash
                + ";regressionType=" + regressionType
                + ";strategyType=" + strategyType;
    }
}
