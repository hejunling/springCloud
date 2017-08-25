package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.BussinesInfo;
import com.tuodao.bp.useraccount.db.model.basic.BussinesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinesInfoMapper {
    int countByExample(BussinesInfoExample example);

    int deleteByExample(BussinesInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BussinesInfo record);

    int insertSelective(BussinesInfo record);

    List<BussinesInfo> selectByExample(BussinesInfoExample example);

    BussinesInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BussinesInfo record, @Param("example") BussinesInfoExample example);

    int updateByExample(@Param("record") BussinesInfo record, @Param("example") BussinesInfoExample example);

    int updateByPrimaryKeySelective(BussinesInfo record);

    int updateByPrimaryKey(BussinesInfo record);
}