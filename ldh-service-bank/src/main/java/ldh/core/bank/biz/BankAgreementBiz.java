package ldh.core.bank.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.core.biz.BaseBizImpl;
import ldh.common.core.dao.BaseDao;
import ldh.core.bank.dao.BankAgreementDao;
import ldh.facade.bank.entity.BankAgreement;


@Component("bankAgreementBiz")
public class BankAgreementBiz extends BaseBizImpl<BankAgreement> {

	@Autowired
	private BankAgreementDao bankAgreementDao;

	@Override
	protected BaseDao<BankAgreement> getDao() {
		return bankAgreementDao;
	}

}
