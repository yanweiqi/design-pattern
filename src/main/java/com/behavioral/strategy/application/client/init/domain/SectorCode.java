package com.behavioral.strategy.application.client.init.domain;

/**
 * Created by yujianming on 2016/4/17.
 */

public enum SectorCode {
    Energy ("能源", "Energy"),
    Materials ("材料", "Materials"),
    ConsumerDiscretionary ("可选消费", "ConsumerDiscretionary"),
    ConsumerStaples ("日常消费", "ConsumerStaples"),
    Industrials("工业", "Industrials"),
    HealthCare ("医疗保健", "HealthCare"),
    Financials ("金融", "Financials"),
    InformationTechnology ("信息技术", "InformationTechnology"),
    TelecommunicationServices ("电信服务", "TelecommunicationServices"),
    Utilities ("公用事业", "Utilities");

    private final String sectorName;
    private final String sectorCode;

    SectorCode(String name, String code) {
        this.sectorName = name;
        this.sectorCode = code;
    }

    public String getCode() {
        return this.sectorCode;
    }

    public String getName() {
        return this.sectorName;
    }
}