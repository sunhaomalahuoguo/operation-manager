package com.sumavision.operation.service;

import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.service.impl.TradeClientServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "operation-trade",fallback = TradeClientServiceFallBack.class)
public interface TradeClientService {

    @GetMapping("/traderecorde/get/{id}")
    public TradeRecord getTradeRecordById(@PathVariable("id") Long id);

    @GetMapping("/traderecorde/list")
    public List<TradeRecord> itemsPage(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize);
}
