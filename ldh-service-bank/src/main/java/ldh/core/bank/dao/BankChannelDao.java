package ldh.core.bank.dao;


import java.util.List;
import java.util.Map;

import ldh.common.core.dao.BaseDao;
import ldh.facade.bank.entity.BankChannel;

public interface BankChannelDao extends BaseDao<BankChannel> {
	/**
	 * 根据银行渠道编号查找 
	 */
	BankChannel getByBankChannelCode(String bankChannelCode);
	
	/**
	 * 根据银行渠道编号模糊查找 
	 */
	List<BankChannel> likeBy(String bankChannelCode, Integer status);
	
	/**
	 * 删除银行渠道 .
	 */
    void deleteChannelByCode(String bankChannelCode);

    /***
	 * 根据银行渠道名称查询银行渠道信息
	 */
	BankChannel getByBankChannelName(String channelName);
	
	/**
	 * 根据银行协议ID获取银行渠道
	 * */
	BankChannel getByBankAgreementId(long bankAgreementId);
	
	/**
	 *条件查询 
	 */
	List  listBy(Map<String , Object> param);

	/**
	 * 根据协议表中的业务类型和账户表中的账户性质查询出对应的渠道
	 */
	List<BankChannel> listChannalByAgreementBusTypeAndAccountType(int linkType , int accountType);
	
	boolean isUsableBankChannel(String bankChannelCode);

}