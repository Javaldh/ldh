package ldh.facade.bank.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.bank.biz.CardBinBiz;
import ldh.facade.bank.entity.CardBin;
import ldh.facade.bank.service.CardBinFacade;


/**
 * @描述: 银行卡卡Bin信息Dubbo服务接口实现类.
 */
@Component("cardBinFacade")
public class CardBinFacadeImpl implements CardBinFacade {

	@Autowired
	private CardBinBiz cardBinBiz;

	@Override
	public long create(CardBin cardBin) {
		return cardBinBiz.create(cardBin);
	}

	@Override
	public long update(CardBin cardBin) {
		return cardBinBiz.update(cardBin);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return cardBinBiz.listPage(pageParam, paramMap);
	}

	@Override
	public CardBin getById(long id) {
		return cardBinBiz.getById(id);
	}

	/**
	 * 根据卡BIN查找
	 */
	public CardBin getByCardBin(String cardBin, Integer status) {
		return cardBinBiz.getByCardBin(cardBin, status);
	}
}
