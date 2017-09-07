package ldh.core.boss.dao.impl; 

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.TownDao;
import ldh.facade.boss.entity.Town;


/**
 *类描述：
 *@author: huangbin
 *@date： 日期：2013-11-27 时间：下午2:59:42
 *@version 1.0
 */
@Repository("townDao")
public class TownDaoImpl extends BaseDaoImpl<Town> implements TownDao{

}
 