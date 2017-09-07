package ldh.core.boss.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.MerchantSalesDao;
import ldh.facade.boss.entity.MerchantSales;


@Repository("merchantSalesDao")
public class MerchantSalesDaoImpl extends BaseDaoImpl<MerchantSales> implements MerchantSalesDao {

	
	public MerchantSales getByMerchantNo(String merchantNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("merchantNo", merchantNo);
		return super.getBy(map);
	}

	@Override
	public List<MerchantSales> listByCondition(Map<String, Object> paramMap) {
		return this.listBy(paramMap);
	}
	
}
