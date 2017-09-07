package ldh.common.core.service;

import java.util.List;
import java.util.Map;

import ldh.common.entity.BaseEntity;
import ldh.common.page.PageBean;
import ldh.common.page.PageParam;


/**
 * 基类Service接口
 */
public interface BaseService<T extends BaseEntity> {

	/**
	 * 根据ID查找记录.
	 */
	T getById(long id);
	
	/**
	 * 分页查询 .
	 * @param pageParam
	 *            分页参数.
	 * @param paramMap
	 *            业务条件查询参数.
	 */
	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);

	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId);

	/**
	 * 根据条件查询 listBy: <br/>
	 */
	List<T> listBy(Map<String, Object> paramMap);

	List<Object> listBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 根据条件查询 listBy: <br/>
	 */
	T getBy(Map<String, Object> paramMap);

	Object getBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 根据序列名称获取下一个值
	 */
	String getSeqNextValue(String seqName);

}
