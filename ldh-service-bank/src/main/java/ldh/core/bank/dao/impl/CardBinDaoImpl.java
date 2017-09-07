package ldh.core.bank.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.bank.dao.CardBinDao;
import ldh.facade.bank.entity.CardBin;


@Repository(value="cardBinDao")
public class CardBinDaoImpl extends BaseDaoImpl<CardBin> implements CardBinDao {
	
	public CardBin getByCardBin(String cardBin, Integer status){

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cardBin", cardBin);
		params.put("status", status);
		return super.getBy(params);
	}

}