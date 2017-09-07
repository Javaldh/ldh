package ldh.core.bank.dao;


import ldh.common.core.dao.BaseDao;
import ldh.facade.bank.entity.BankAgreement;

public interface BankAgreementDao extends BaseDao<BankAgreement> {
	/**
	 * 根据商户编号查找银行协议 .
	 */
	BankAgreement getByMerchantNo(String merchantNo);
}