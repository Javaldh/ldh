package ldh.facade.cost.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.cost.entity.CalFeeWay;
import ldh.facade.cost.exceptions.CostBizException;


/**
 * @描述: 计费约束信息，Dubbo服务接口.
 */
public interface CalFeeWayFacade {
	/**
	 * 创建计费约束信息
	 * 
	 * @param entity
	 * @return
	 */
	public long create(CalFeeWay entity) throws CostBizException;

	/**
	 * 修改计费约束信息
	 * 
	 * @param entity
	 * @return
	 */
	public long update(CalFeeWay entity) throws CostBizException;

	/**
	 * 分页查询计费约束信息
	 * 
	 * @param pageParam
	 *            分页实体对象
	 * @param paramMap
	 *            查询条件
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap)
			throws CostBizException;

	/**
	 * 获取所有的计费约束
	 * 
	 * @return
	 * @throws CostBizException
	 */
	public List<CalFeeWay> listAll() throws CostBizException;

	/**
	 * 根据ID查找计费约束信息
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	public CalFeeWay getById(long id) throws CostBizException;

	/***
	 * 根据维度ID查询计费约束信息
	 * 
	 * @param dimensionId
	 *            维度ID
	 * @return
	 */
	public List<CalFeeWay> getByDimensionId(int dimensionId)
			throws CostBizException;

	/**
	 * 根据Id删除计费约束信息
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	public void deleteById(long id) throws CostBizException;
}
