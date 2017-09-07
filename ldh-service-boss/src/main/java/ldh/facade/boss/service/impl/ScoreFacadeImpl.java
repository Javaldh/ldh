package ldh.facade.boss.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.boss.biz.ScoreBiz;
import ldh.facade.boss.entity.Score;
import ldh.facade.boss.entity.ScoreLog;
import ldh.facade.boss.exceptions.BossBizException;
import ldh.facade.boss.service.ScoreFacade;


@Component("scoreFacade")
public class ScoreFacadeImpl implements ScoreFacade {
	@Autowired
	private ScoreBiz scoreBiz;

	/***
	 * 创建积分信息
	 */
	public long createScore(Score score) {
		return scoreBiz.createScore(score);
	}

	/***
	 * 修改积分信息
	 */
	public long updScore(Score score) {
		return scoreBiz.updScore(score);
	}

	/***
	 * 根据条件查询积分信息
	 */
	public Score getBy(Map<String, Object> map) throws BossBizException {
		return scoreBiz.getBy(map);
	}

	/***
	 * 创建积分记录表信息
	 */
	public long createScoreLog(ScoreLog scoreLog) throws BossBizException {
		return scoreBiz.createScoreLog(scoreLog);
	}

	/***
	 * 查询积分记录列表-分页
	 */
	public PageBean queryPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException {
		return scoreBiz.queryPage(pageParam, paramMap);
	}

	/***
	 * 账户登录增加登录积分
	 * 
	 * @param accountId
	 *            账户ID
	 * @param score
	 *            积分数
	 * @param changeDesc
	 *            积分变更描述
	 * @throws BossBizException
	 */
	public long loginAddScore(String accountNo, Long score, String changeDesc) throws BossBizException {
		return scoreBiz.loginAddScore(accountNo, score, changeDesc);
	}
}
