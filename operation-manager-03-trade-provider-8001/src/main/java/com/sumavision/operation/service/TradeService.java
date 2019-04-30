package com.sumavision.operation.service;

import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.entities.TradeRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeService {

    public int countByExample(TradeRecordQuery example);

    public int deleteByExample(TradeRecordQuery example);

    public int deleteByPrimaryKey(Long id);

    public int insert(TradeRecord record);

    public int insertSelective(TradeRecord record);

    public List<TradeRecord> selectByExample(TradeRecordQuery example);

    public TradeRecord selectByPrimaryKey(Long id);

    public int updateByExampleSelective(@Param("record") TradeRecord record, @Param("example") TradeRecordQuery example);

    public int updateByExample(@Param("record") TradeRecord record, @Param("example") TradeRecordQuery example);

    public int updateByPrimaryKeySelective(TradeRecord record);

    public int updateByPrimaryKey(TradeRecord record);

    public List<TradeRecord> findItemByPage(int currentPage,int pageSize);
}
