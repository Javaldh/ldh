package ldh.core.bank.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.bank.dao.BankAgreementDao;
import ldh.facade.bank.entity.BankAgreement;


/**
 */
@Repository(value = "bankAgreementDao")
public class BankAgreementDaoImpl extends BaseDaoImpl<BankAgreement> implements BankAgreementDao {
	/**
	 * 根据商户编号查找银行协议 .
	 */
	public BankAgreement getByMerchantNo(String merchantNo) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("merchantNo", merchantNo);

		return super.getBy(params);
	}
}