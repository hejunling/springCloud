package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.UserLabel;
import com.tuodao.bp.useraccount.db.model.basic.UserLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLabelMapper {
    int countByExample(UserLabelExample example);

    int deleteByExample(UserLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLabel record);

    int insertSelective(UserLabel record);

    List<UserLabel> selectByExample(UserLabelExample example);

    UserLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLabel record, @Param("example") UserLabelExample example);

    int updateByExample(@Param("record") UserLabel record, @Param("example") UserLabelExample example);

    int updateByPrimaryKeySelective(UserLabel record);

    int updateByPrimaryKey(UserLabel record);
}