package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.ConfigDictonary;
import com.tuodao.bp.useraccount.db.model.basic.ConfigDictonaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigDictonaryMapper {
    int countByExample(ConfigDictonaryExample example);

    int deleteByExample(ConfigDictonaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigDictonary record);

    int insertSelective(ConfigDictonary record);

    List<ConfigDictonary> selectByExample(ConfigDictonaryExample example);

    ConfigDictonary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigDictonary record, @Param("example") ConfigDictonaryExample example);

    int updateByExample(@Param("record") ConfigDictonary record, @Param("example") ConfigDictonaryExample example);

    int updateByPrimaryKeySelective(ConfigDictonary record);

    int updateByPrimaryKey(ConfigDictonary record);
}