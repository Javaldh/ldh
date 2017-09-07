package ldh.facade.boss.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.boss.entity.ContractManagement;
import ldh.facade.boss.exceptions.BossBizException;

/***
 * 
 * @描述: 合同管理接口.
 */
public interface ContractManagementFacade {
	
	public long create(ContractManagement entity) throws BossBizException;

	public long update(ContractManagement entity) throws BossBizException;

	public ContractManagement getById(long id) throws BossBizException;

	public ContractManagement getBy(Map<String, Object> map) throws BossBizException;

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException;
	
	public List<ContractManagement> getByMerchantId(String merchantId) throws BossBizException;

	public ContractManagement getByUserNo(String merchantNo);

}
