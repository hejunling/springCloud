package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.UserDepositInfo;
import com.tuodao.bp.useraccount.db.model.basic.UserDepositInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDepositInfoMapper {
    int countByExample(UserDepositInfoExample example);

    int deleteByExample(UserDepositInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDepositInfo record);

    int insertSelective(UserDepositInfo record);

    List<UserDepositInfo> selectByExample(UserDepositInfoExample example);

    UserDepositInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDepositInfo record, @Param("example") UserDepositInfoExample example);

    int updateByExample(@Param("record") UserDepositInfo record, @Param("example") UserDepositInfoExample example);

    int updateByPrimaryKeySelective(UserDepositInfo record);

    int updateByPrimaryKey(UserDepositInfo record);
}