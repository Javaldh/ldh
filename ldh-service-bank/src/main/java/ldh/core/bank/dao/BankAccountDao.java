package ldh.core.bank.dao;

import java.util.List;

import ldh.common.core.dao.BaseDao;
import ldh.facade.bank.entity.BankAccount;



/**
 * @描述: 银行账户信息表，数据访问层接口.
 */
public interface BankAccountDao extends BaseDao<BankAccount> {
	
	/**
	 * 根据银行账号模糊查找 
	 */
	List<BankAccount> likeBy(String bankAccountKey, Integer status);
}