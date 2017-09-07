package ldh.facade.boss.service;

import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.boss.entity.GlobalSet;
import ldh.facade.boss.exceptions.BossBizException;


/**
 * @描述: 运营全局设置.
 */
public interface GlobalSetFacade {

	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException;

	GlobalSet getById(long id) throws BossBizException;

	long update(GlobalSet entity) throws BossBizException;
	
	/***
	 * 根据键名查询全局设置表数据
	 * @param keyValue 键名
	 * @return
	 * @throws BossBizException
	 */
	GlobalSet getBySetKey(String keyValue) throws BossBizException;
}
