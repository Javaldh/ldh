package ldh.facade.limit.service;

import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.limit.entity.TradeLimitRouter;
import ldh.facade.limit.exceptions.LimitBizException;


/**
 * @描述: 商户关联开关限制和额度限制接口.
 */
public interface TradeLimitRouterFacade {
	/****
	 * 查询列表方法
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws LimitBizException;

	/***
	 * 增加商户关联开关限制和额度限制
	 * 
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long saveTradeLimitRouter(TradeLimitRouter entity) throws LimitBizException;

	/***
	 * 修改商户关联开关限制和额度限制
	 * 
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long updateTradeLimitRouter(TradeLimitRouter entity) throws LimitBizException;

	/***
	 * 删除商户关联开关限制和额度限制
	 * 
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public long deleteTradeLimitRouter(Long id) throws LimitBizException;

	/***
	 * 根据ID查
	 * 
	 * @param entity
	 * @return
	 * @throws LimitBizException
	 */
	public TradeLimitRouter getById(Long id) throws LimitBizException;

	/**
	 * 根据开关限制包的主键加载数据 1 业务功能 2 支付产品 3 支付方式
	 * 
	 * @param switchLimitPackId
	 * @return
	 */
	public Map<String, Object> queryDataBySwitchLimitPackId(Long switchLimitPackId) throws LimitBizException;

	/**
	 * 根据商户编号查询数据
	 * @param merchantNo
	 * @return
	 */
	public TradeLimitRouter getTradeLimitRouterByMerchantNo(String merchantNo);
}
