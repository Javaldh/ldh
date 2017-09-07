package ldh.core.boss.dao;

import java.util.List;
import java.util.Map;

import ldh.common.core.dao.BaseDao;
import ldh.facade.boss.entity.MerchantSales;


public interface MerchantSalesDao extends BaseDao<MerchantSales>{

	MerchantSales getByMerchantNo(String merchantNo);

	List<MerchantSales> listByCondition(Map<String, Object> paramMap);
	
}
