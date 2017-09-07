/**
 * wusc.edu.pay.bank.dao.impl.BankAccountDaoImpl.java
 */
package ldh.core.bank.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.bank.dao.BankAccountDao;
import ldh.facade.bank.entity.BankAccount;


/**
 * @描述: 银行账户信息表，数据访问层接口实现类.
 */
@Repository("bankAccountDao")
public class BankAccountDaoImpl extends BaseDaoImpl<BankAccount> implements BankAccountDao {
	
	/**
	 * 根据银行账号模糊查找 
	 */
	public List<BankAccount> likeBy(String bankAccountKey, Integer status){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("bankAccountKey", bankAccountKey);
		params.put("status", status);
		return super.getSessionTemplate().selectList(getStatement("likeBy"), params);
	}
}