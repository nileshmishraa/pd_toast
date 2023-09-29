package com.vmware.tanzu.demos.sta.tradingagent.bid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class StockAgentListener {

    @Autowired
    BidController bidController;

    @Scheduled(cron = "*/10 * * * * *")
    public void run() {
        while (true) {
            bidController.sendBidRequest();
        }
    }

}
