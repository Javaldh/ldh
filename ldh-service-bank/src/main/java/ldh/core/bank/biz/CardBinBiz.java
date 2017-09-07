package ldh.core.bank.biz;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.core.biz.BaseBizImpl;
import ldh.common.core.dao.BaseDao;
import ldh.core.bank.dao.CardBinDao;
import ldh.facade.bank.entity.CardBin;
import ldh.facade.bank.exceptions.BankBizException;


/**
 * @描述: 银行卡卡Bin信息管理业务逻辑层 .
 */
@Component("cardBinBiz")
public class CardBinBiz extends BaseBizImpl<CardBin> {

	@Autowired
	private CardBinDao cardBinDao;

	@Override
	protected BaseDao<CardBin> getDao() {
		return cardBinDao;
	}

	/**
	 * 根据卡Bin值查找卡Bin信息.
	 */
	public CardBin getByCardBin(String cardBin, Integer status) {
		if(StringUtils.isBlank(cardBin)){
			throw new BankBizException(BankBizException.BANK_SERVICE_PARAMS_ERROR, "cardBin不能为空:%s", cardBin);
		}
		return cardBinDao.getByCardBin(cardBin, status);
	}

}
