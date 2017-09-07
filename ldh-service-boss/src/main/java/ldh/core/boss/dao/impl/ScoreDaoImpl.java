package ldh.core.boss.dao.impl; 

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.ScoreDao;
import ldh.facade.boss.entity.Score;


/**
 *类描述：积分信息Dao实现
 *@author: huangbin
 *@date： 日期：2013-12-3 时间：上午11:37:50
 *@version 1.0
 */
@Repository("scoreDao")
public class ScoreDaoImpl extends BaseDaoImpl<Score> implements ScoreDao {

}
 