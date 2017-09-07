package ldh.facade.boss.service;

import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.boss.entity.Score;
import ldh.facade.boss.entity.ScoreLog;
import ldh.facade.boss.exceptions.BossBizException;


/**
 * 类描述：积分管理对外接口
 */
public interface ScoreFacade {

	/***
	 * 创建积分信息
	 */
	public long createScore(Score score);

	/***
	 * 修改积分信息
	 */
	public long updScore(Score score);

	/***
	 * 根据条件查询积分信息
	 */
	public Score getBy(Map<String, Object> map) throws BossBizException;

	/***
	 * 创建积分记录表信息
	 */
	public long createScoreLog(ScoreLog scoreLog) throws BossBizException;

	/***
	 * 查询积分记录列表
	 */
	public PageBean queryPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException;

	/***
	 * 账户登录增加登录积分
	 */
	public long loginAddScore(String accountNo, Long score, String changeDesc) throws BossBizException;
}
