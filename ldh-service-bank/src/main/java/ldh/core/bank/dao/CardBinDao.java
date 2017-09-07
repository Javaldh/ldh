/**
 * wusc.edu.pay.bank.dao.BankAccountDao.java
 */
package ldh.core.bank.dao;


import ldh.common.core.dao.BaseDao;
import ldh.facade.bank.entity.CardBin;

/**
 * @author System
 *
 * @since 2013-11-07
 */
public interface CardBinDao extends BaseDao<CardBin> {
	
	CardBin getByCardBin(String cardBin, Integer status);
}