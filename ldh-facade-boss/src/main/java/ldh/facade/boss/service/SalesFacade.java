package ldh.facade.boss.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.boss.entity.Sales;
import ldh.facade.boss.exceptions.BossBizException;


/**
 * 类描述：
 */
public interface SalesFacade {

	public long create(Sales sales) throws BossBizException;

	public long update(Sales sales) throws BossBizException;

	public Sales getById(long salesid) throws BossBizException;

	/***
	 * 查询列表方法-分页
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 */
	public PageBean querySalesPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException;

	/***
	 * 根据条件查询列表
	 * 
	 * @param paramMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List listByCondition(Map<String, Object> paramMap) throws BossBizException;
	
	/**
	 * 生成机具编号
	 * 
	 * @param bizType
	 * @return
	 */
	public String buildSalesNo() throws BossBizException;

}
