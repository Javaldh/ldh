package ldh.facade.boss.service;

import java.util.List;
import java.util.Map;

import ldh.facade.boss.entity.MerchantSales;
import ldh.facade.boss.exceptions.BossBizException;


/***
 * 
 * @author huangbin
 *
 */
public interface MerchantSalesFacade {
	
	
	public long create(MerchantSales sales) throws BossBizException;
	
	
	public long update(MerchantSales sales)  throws BossBizException;
	
	
	public MerchantSales getById(Long id) throws BossBizException;

	public MerchantSales getByMerchantNo(String merchantNo);

	public void deteleById(Long sId);
	
	/***
	 * 根据条件查询列表
	 */
	public List<MerchantSales> listByCondition(Map<String, Object> paramMap) throws BossBizException;
}
