package ldh.core.boss.dao.impl; 

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.GlobalSetDao;
import ldh.facade.boss.entity.GlobalSet;


/**
 *类描述：基础信息dao实现类
 *@author: huangbin
 *@date： 日期：2013-10-16 时间：下午6:04:45
 *@todo: TODO
 *@version 1.0
 */
@Repository("globalSetDao")
public class GlobalSetDaoImpl extends BaseDaoImpl<GlobalSet> implements GlobalSetDao {
}
 