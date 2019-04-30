package com.sumavision.operation.dao;

import com.sumavision.operation.entities.TradeRecord;
import com.sumavision.operation.entities.TradeRecordQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRecordDao {
    int countByExample(TradeRecordQuery example);

    int deleteByExample(TradeRecordQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TradeRecord record);

    int insertSelective(TradeRecord record);

    List<TradeRecord> selectByExample(TradeRecordQuery example);

    TradeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TradeRecord record, @Param("example") TradeRecordQuery example);

    int updateByExample(@Param("record") TradeRecord record, @Param("example") TradeRecordQuery example);

    int updateByPrimaryKeySelective(TradeRecord record);

    int updateByPrimaryKey(TradeRecord record);
}