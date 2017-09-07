package ldh.facade.boss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.boss.biz.ContractManagementBiz;
import ldh.facade.boss.entity.ContractManagement;
import ldh.facade.boss.exceptions.BossBizException;
import ldh.facade.boss.service.ContractManagementFacade;


/***
 * @描述: 合同管理接口实现类.
 */
@Component("contractManagementFacade")
public class ContractManagementFacadeImpl implements ContractManagementFacade{

	@Autowired 
	private ContractManagementBiz contractManagementBiz;
	
	@Override
	public long create(ContractManagement contractManagement) throws BossBizException {
		return contractManagementBiz.create(contractManagement);
	}

	@Override
	public long update(ContractManagement contractManagement) throws BossBizException {
		return contractManagementBiz.update(contractManagement);
	}

	@Override
	public ContractManagement getById(long id) throws BossBizException {
		return contractManagementBiz.getById(id);
	}

	@Override
	public ContractManagement getBy(Map<String, Object> map) throws BossBizException {
		return contractManagementBiz.getBy(map);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap)
			throws BossBizException {
		return contractManagementBiz.listPage(pageParam, paramMap);
	}

	@Override
	public List<ContractManagement> getByMerchantId(String merchantId) throws BossBizException {
		return contractManagementBiz.getByMerchantId(merchantId);		
	}

	@Override
	public ContractManagement getByUserNo(String merchantNo) {
		return contractManagementBiz.getByUserNo(merchantNo);
	}
}
