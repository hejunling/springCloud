package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.UserInfoExtend;
import com.tuodao.bp.useraccount.db.model.basic.UserInfoExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoExtendMapper {
    int countByExample(UserInfoExtendExample example);

    int deleteByExample(UserInfoExtendExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserInfoExtend record);

    int insertSelective(UserInfoExtend record);

    List<UserInfoExtend> selectByExample(UserInfoExtendExample example);

    UserInfoExtend selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserInfoExtend record, @Param("example") UserInfoExtendExample example);

    int updateByExample(@Param("record") UserInfoExtend record, @Param("example") UserInfoExtendExample example);

    int updateByPrimaryKeySelective(UserInfoExtend record);

    int updateByPrimaryKey(UserInfoExtend record);
}