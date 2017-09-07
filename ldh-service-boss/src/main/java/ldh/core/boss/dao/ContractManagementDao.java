package ldh.core.boss.dao;

import java.util.List;

import ldh.common.core.dao.BaseDao;
import ldh.facade.boss.entity.ContractManagement;


/***
 * @描述: 合同管理DAO.
 */
public interface ContractManagementDao extends BaseDao<ContractManagement>{
	
	/**
	 * 根据merchantId查找记录.
	 */
	List<ContractManagement> getByMerchantId(String merchantId);

	ContractManagement getByUserNo(String merchantNo);

}
