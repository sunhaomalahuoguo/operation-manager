package com.sumavision.operation.service.impl;

import com.github.pagehelper.PageHelper;
import com.sumavision.operation.dao.TradeRecordDao;
import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.entities.TradeRecordQuery;
import com.sumavision.operation.service.TradeService;
import com.sumavision.operation.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    TradeRecordDao tradeRecordDao;

    @Override
    public int countByExample(TradeRecordQuery example) {
        return tradeRecordDao.countByExample(example);
    }

    @Override
    public int deleteByExample(TradeRecordQuery example) {
        return tradeRecordDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tradeRecordDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TradeRecord record) {
        return tradeRecordDao.insert(record);
    }

    @Override
    public int insertSelective(TradeRecord record) {
        return tradeRecordDao.insertSelective(record);
    }

    @Override
    public List<TradeRecord> selectByExample(TradeRecordQuery example) {
        return tradeRecordDao.selectByExample(example);
    }

    @Override
    public TradeRecord selectByPrimaryKey(Long id) {
        return tradeRecordDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TradeRecord record, TradeRecordQuery example) {
        return tradeRecordDao.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TradeRecord record, TradeRecordQuery example) {
        return tradeRecordDao.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TradeRecord record) {
        return tradeRecordDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TradeRecord record) {
        return tradeRecordDao.updateByPrimaryKey(record);
    }

    @Override
    public List<TradeRecord> findItemByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        TradeRecordQuery example = new TradeRecordQuery();
        List<TradeRecord> allTr = tradeRecordDao.selectByExample(example);        //全部商品
        int countNums = tradeRecordDao.countByExample(example);            //总记录数
        PageBean<TradeRecord> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allTr);
        return pageData.getItems();
    }
}
