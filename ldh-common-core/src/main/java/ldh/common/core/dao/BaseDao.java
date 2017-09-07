package ldh.common.core.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;


/**
 * @描述: 数据访问层基础支撑接口.
 */
public interface BaseDao<T> {

	/**
	 * 根据实体对象新增记录.
	 */
	long insert(T entity);

	/**
	 * 批量保存对象.
	 */
	long insert(List<T> list);

	/**
	 * 更新实体对应的记录.
	 */
	long update(T entity);

	/**
	 * 批量更新对象.
	 */
	long update(List<T> list);

	/**
	 * 根据ID查找记录.
	 */
	T getById(long id);

	/**
	 * 根据ID删除记录.
	 */
	long deleteById(long id);

	/**
	 * 分页查询 .
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

	SqlSessionTemplate getSessionTemplate();

	SqlSession getSqlSession();
}
