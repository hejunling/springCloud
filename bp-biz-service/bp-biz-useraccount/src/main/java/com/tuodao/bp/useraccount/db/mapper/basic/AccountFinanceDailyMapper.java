package com.tuodao.bp.useraccount.db.mapper.basic;

import com.tuodao.bp.useraccount.db.model.basic.AccountFinanceDaily;
import com.tuodao.bp.useraccount.db.model.basic.AccountFinanceDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountFinanceDailyMapper {
    int countByExample(AccountFinanceDailyExample example);

    int deleteByExample(AccountFinanceDailyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountFinanceDaily record);

    int insertSelective(AccountFinanceDaily record);

    List<AccountFinanceDaily> selectByExample(AccountFinanceDailyExample example);

    AccountFinanceDaily selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountFinanceDaily record, @Param("example") AccountFinanceDailyExample example);

    int updateByExample(@Param("record") AccountFinanceDaily record, @Param("example") AccountFinanceDailyExample example);

    int updateByPrimaryKeySelective(AccountFinanceDaily record);

    int updateByPrimaryKey(AccountFinanceDaily record);
}