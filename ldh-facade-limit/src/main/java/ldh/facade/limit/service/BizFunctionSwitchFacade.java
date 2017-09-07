package ldh.facade.limit.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.limit.entity.BizFunctionSwitch;
import ldh.facade.limit.exceptions.LimitBizException;


/**
 * @描述: 业务功能开关接口.
 */
public interface BizFunctionSwitchFacade {
	/****
	 * 查询列表方法
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws LimitBizException;	
	/***
	 * 增加业务功能开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long saveBizFunctionSwitch(BizFunctionSwitch entity) throws LimitBizException;
	/***
	 * 修改业务功能开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long updateBizFunctionSwitch(BizFunctionSwitch entity) throws LimitBizException;
	/***
	 * 删除业务功能开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long deleteBizFunctionSwitch(Long id) throws LimitBizException;

	/***
	 * 根据ID查
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public BizFunctionSwitch getById (Long id) throws LimitBizException;
	
	
	/***
	 * 删除业务功能开关
	 * @param switchLimitPackId
	 * @param bizFunction
	 * @return
	 * @throws LimitBizException
	 */
	public long deleteBizFunctionSwitchByPackIdAndFunction(Long switchLimitPackId, String bizFunction) throws LimitBizException;
	
	
	/**
	 * 根据商户编号查询业务功能
	 * @param merchantNo
	 * @return
	 */
	public List<BizFunctionSwitch> getBizFunctionSwitchByMerchantNo(String merchantNo) throws LimitBizException;
}
