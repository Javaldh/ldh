package ldh.core.bank.dao;


import ldh.common.core.dao.BaseDao;
import ldh.facade.bank.entity.CardBin;

public interface CardBinDao extends BaseDao<CardBin> {
	
	CardBin getByCardBin(String cardBin, Integer status);
}