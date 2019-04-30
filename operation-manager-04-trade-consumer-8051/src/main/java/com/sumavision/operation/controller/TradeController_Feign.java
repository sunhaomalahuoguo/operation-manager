package com.sumavision.operation.controller;

import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.service.TradeClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 梦学谷
 */
@Controller
public class TradeController_Feign {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    TradeClientService tradeClientService;

    @GetMapping("/trade/get/{id}")
    public TradeRecord getTradeRecordById(@PathVariable("id") Long id){
        return tradeClientService.getTradeRecordById(id);
    }

    @GetMapping("/trade/list")
    public String itemsPage(Map<String,Object> map){
        //int currentPage, int pageSize
        List<TradeRecord> tradeRecordList = tradeClientService.itemsPage(1, 10);
        logger.info(tradeRecordList.toString());
        map.put("tradeRecordList",tradeRecordList);
        return "/admin/trade_manage/query_manage/query_condition";
    }

}
