package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.UesrBussiness;
import com.tuodao.bp.useraccount.db.model.basic.UesrBussinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UesrBussinessMapper {
    int countByExample(UesrBussinessExample example);

    int deleteByExample(UesrBussinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UesrBussiness record);

    int insertSelective(UesrBussiness record);

    List<UesrBussiness> selectByExample(UesrBussinessExample example);

    UesrBussiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UesrBussiness record, @Param("example") UesrBussinessExample example);

    int updateByExample(@Param("record") UesrBussiness record, @Param("example") UesrBussinessExample example);

    int updateByPrimaryKeySelective(UesrBussiness record);

    int updateByPrimaryKey(UesrBussiness record);
}