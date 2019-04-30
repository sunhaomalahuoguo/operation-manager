package com.sumavision.operation.service.impl;

import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.service.TradeClientService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TradeClientServiceFallBack implements TradeClientService {

    @Override
    public TradeRecord getTradeRecordById(Long id) {
        return new TradeRecord();
    }

    @Override
    public List<TradeRecord> itemsPage(int currentPage, int pageSize) {
        return new ArrayList<TradeRecord>();
    }
}
