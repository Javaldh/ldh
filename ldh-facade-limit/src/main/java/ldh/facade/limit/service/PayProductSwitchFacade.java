package ldh.facade.limit.service;

import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.limit.entity.PayProductSwitch;
import ldh.facade.limit.exceptions.LimitBizException;


/**
 * 
 * @描述: 支付产品开关接口.
 */
public interface PayProductSwitchFacade {
	/****
	 * 查询列表方法
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws LimitBizException;
	
	/***
	 * 增加支付产品开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long savePayProductSwitch(PayProductSwitch entity) throws LimitBizException;
	/***
	 * 修改支付产品开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long updatePayProductSwitch(PayProductSwitch entity) throws LimitBizException;
	/***
	 * 删除支付产品开关
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long deletePayProductSwitch(Long id) throws LimitBizException;

	/***
	 * 根据ID查
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public PayProductSwitch getById (Long id) throws LimitBizException;
	
	/***
	 * 删除支付产品开关
	 * @param switchLimitPackId
	 * @param payProduct
	 * @return
	 * @throws LimitBizException
	 */
	public long deletePayProductSwitchByPackIdAndProduct(Long switchLimitPackId, String payProduct) throws LimitBizException;
}
