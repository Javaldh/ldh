package ldh.core.boss.dao.impl; 

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.CityDao;
import ldh.facade.boss.entity.City;


/**
 *类描述：
 *@author: huangbin
 *@date： 日期：2013-11-27 时间：下午2:59:14
 *@version 1.0
 */
@Repository("cityDao")
public class CityDaoImpl extends BaseDaoImpl<City> implements CityDao {

}
 