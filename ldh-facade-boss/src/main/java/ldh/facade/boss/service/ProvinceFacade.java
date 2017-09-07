package ldh.facade.boss.service;

import java.util.List;
import java.util.Map;

import ldh.facade.boss.entity.City;
import ldh.facade.boss.entity.Province;
import ldh.facade.boss.entity.Town;
import ldh.facade.boss.exceptions.BossBizException;


/**
 * 类描述：省市区对外发布接口
 */
@SuppressWarnings("rawtypes")
public interface ProvinceFacade {

	/***
	 * 查询省列表
	 */
	public List listProvince(Map<String, Object> paramMap) throws BossBizException;
	
	/***
	 * 根据省编号查询
	 */
	public Province getProvinceByCode(String code) throws BossBizException;

	/***
	 * 查询城市列表
	 */
	public List listCityBy(Map<String, Object> paramMap) throws BossBizException;
	
	/***
	 * 根据市编号查询
	 */
	public City getCityByCode(String code) throws BossBizException;

	/***
	 * 查询地区城镇列表
	 */
	public List listTownBy(Map<String, Object> paramMap) throws BossBizException;
	
	/***
	 * 根据区编号查询
	 */
	public Town getTownByCode(String code) throws BossBizException;

}
