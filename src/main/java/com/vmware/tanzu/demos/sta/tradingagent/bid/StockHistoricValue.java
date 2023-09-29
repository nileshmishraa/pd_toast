package com.vmware.tanzu.demos.sta.tradingagent.bid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockHistoricValue {

    BigDecimal price;
}
