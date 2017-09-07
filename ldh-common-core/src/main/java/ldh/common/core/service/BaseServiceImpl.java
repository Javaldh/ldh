package ldh.common.core.service;

import java.util.List;
import java.util.Map;

import ldh.common.core.dao.BaseDao;
import ldh.common.entity.BaseEntity;
import ldh.common.page.PageBean;
import ldh.common.page.PageParam;


/**
 * Service 基类实现
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	protected abstract BaseDao<T> getDao();

	public T getById(long id) {
		return this.getDao().getById(id);
	}

	/**
	 * 分页查询 .
	 * 
	 * @param pageParam
	 *            分页参数.
	 * @param paramMap
	 *            业务条件查询参数.
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return this.getDao().listPage(pageParam, paramMap);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId) {
		return this.getDao().listPage(pageParam, paramMap, sqlId);
	}

	/**
	 * 根据条件查询 listBy: <br/>
	 */
	public List<T> listBy(Map<String, Object> paramMap) {
		return this.getDao().listBy(paramMap);
	}

	public List<Object> listBy(Map<String, Object> paramMap, String sqlId) {
		return this.getDao().listBy(paramMap, sqlId);
	}

	/**
	 * 根据条件查询 listBy: <br/>
	 */
	public T getBy(Map<String, Object> paramMap) {
		return this.getDao().getBy(paramMap);
	}

	public Object getBy(Map<String, Object> paramMap, String sqlId) {
		return this.getDao().getBy(paramMap, sqlId);
	}

	/**
	 * 根据序列名称获取下一个值
	 */
	public String getSeqNextValue(String seqName) {
		return this.getDao().getSeqNextValue(seqName);
	}

}
