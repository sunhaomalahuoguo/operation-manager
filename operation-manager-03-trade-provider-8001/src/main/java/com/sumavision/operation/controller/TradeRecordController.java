package com.sumavision.operation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TradeRecordController {

    @Autowired
    TradeService tradeService;

    @GetMapping("/traderecorde/get/{id}")
    public TradeRecord getTradeRecordById(@PathVariable("id") Long id){
        return tradeService.selectByPrimaryKey(id);
    }

    @GetMapping("/traderecorde/list")
    public List<TradeRecord> itemsPage(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize){
        return tradeService.findItemByPage(currentPage, pageSize);
    }

}
