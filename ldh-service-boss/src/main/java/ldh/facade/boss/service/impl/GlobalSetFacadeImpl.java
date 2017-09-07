package ldh.facade.boss.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.boss.biz.GlobalSetBiz;
import ldh.facade.boss.entity.GlobalSet;
import ldh.facade.boss.exceptions.BossBizException;
import ldh.facade.boss.service.GlobalSetFacade;


@Component("globalSetFacade")
public class GlobalSetFacadeImpl implements GlobalSetFacade{
	
	@Autowired
	private GlobalSetBiz globalSetBiz;
	
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return globalSetBiz.queryGlobalSetPage(pageParam, paramMap);
	}

	
	public GlobalSet getById(long id) {
		return globalSetBiz.getById(id);
	}

	
	public long update(GlobalSet globalSet) {
		return globalSetBiz.update(globalSet);
	}


	/***
	 * 根据键名查询全局设置表数据
	 * @param keyValue 键名
	 * @return
	 * @throws BossBizException
	 */
	public GlobalSet getBySetKey(String keyValue) throws BossBizException {
		return globalSetBiz.getBySetKey(keyValue);
	}

}
