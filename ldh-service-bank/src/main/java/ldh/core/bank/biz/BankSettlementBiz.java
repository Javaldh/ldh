package ldh.core.bank.biz;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.core.biz.BaseBizImpl;
import ldh.common.core.dao.BaseDao;
import ldh.common.exceptions.BizException;
import ldh.core.bank.dao.BankSettlementDao;
import ldh.facade.bank.entity.BankSettlement;
import ldh.facade.bank.exceptions.BankBizException;


/**
 * @描述: 银行结算信息管理业务逻辑层实现类.
 */
@Component("bankSettlementBiz")
public class BankSettlementBiz extends BaseBizImpl<BankSettlement> {

	@Autowired
	private BankSettlementDao bankSettlementDao;

	@Override
	protected BaseDao<BankSettlement> getDao() {
		return bankSettlementDao;
	}

	/**
	 * 获取银行渠道状态为可用(100)的银行结算信息，包括以下字段内容:<br/>
	 * "bankChannelCode:银行渠道编号"、<br/>
	 * "tradeGainCheckFileTime:业务对账文件获取时间，如：1.15代表每天凌晨1点15分后获取对账文件"、<br/>
	 * "fundGainCheckFileTime:清算对账文件获取时间，如：1.15代表每天凌晨1点15分后获取对账文件"、<br/>
	 * "settleCycle:结算周期：T+X"
	 */
	public List listAvailableBankSettlementInfo() {
		return bankSettlementDao.listAvailableBankSettlementInfo();
	}
    
	/**
	 * 根据银行渠道编号获取银行结算信息.
	 */
	public BankSettlement getByBankBankChannelCode(String bankChannelCode){
		if(StringUtils.isBlank(bankChannelCode)){
			throw new BankBizException(BankBizException.BANK_SERVICE_PARAMS_ERROR, "银行渠道编号不能为空:%s", bankChannelCode);
		}
		return bankSettlementDao.getByBankBankChannelCode(bankChannelCode);
	}
	
	/**
	 * 获取银行渠道可用状态下的银行账号
	 */
	public List listAvailableBankAccount(){
		return bankSettlementDao.listAvailableBankAccount();
	}
}
