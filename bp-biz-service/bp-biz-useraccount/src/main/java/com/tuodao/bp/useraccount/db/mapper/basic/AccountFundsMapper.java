package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.AccountFunds;
import com.tuodao.bp.useraccount.db.model.basic.AccountFundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountFundsMapper {
    int countByExample(AccountFundsExample example);

    int deleteByExample(AccountFundsExample example);

    int deleteByPrimaryKey(String userId);

    int insert(AccountFunds record);

    int insertSelective(AccountFunds record);

    List<AccountFunds> selectByExample(AccountFundsExample example);

    AccountFunds selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") AccountFunds record, @Param("example") AccountFundsExample example);

    int updateByExample(@Param("record") AccountFunds record, @Param("example") AccountFundsExample example);

    int updateByPrimaryKeySelective(AccountFunds record);

    int updateByPrimaryKey(AccountFunds record);
}