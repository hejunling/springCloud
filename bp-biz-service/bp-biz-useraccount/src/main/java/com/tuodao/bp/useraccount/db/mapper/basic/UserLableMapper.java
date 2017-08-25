package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.UserLable;
import com.tuodao.bp.useraccount.db.model.basic.UserLableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLableMapper {
    int countByExample(UserLableExample example);

    int deleteByExample(UserLableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLable record);

    int insertSelective(UserLable record);

    List<UserLable> selectByExample(UserLableExample example);

    UserLable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLable record, @Param("example") UserLableExample example);

    int updateByExample(@Param("record") UserLable record, @Param("example") UserLableExample example);

    int updateByPrimaryKeySelective(UserLable record);

    int updateByPrimaryKey(UserLable record);
}