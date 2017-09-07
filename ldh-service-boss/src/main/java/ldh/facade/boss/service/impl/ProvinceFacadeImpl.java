package ldh.facade.boss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.core.boss.biz.ProvinceBiz;
import ldh.facade.boss.entity.City;
import ldh.facade.boss.entity.Province;
import ldh.facade.boss.entity.Town;
import ldh.facade.boss.exceptions.BossBizException;
import ldh.facade.boss.service.ProvinceFacade;


/**
 * 类描述：省市区对外发布接口
 */
@SuppressWarnings("rawtypes")
@Component("provinceFacade")
public class ProvinceFacadeImpl implements ProvinceFacade {
	@Autowired
	private ProvinceBiz provinceBiz;

	/***
	 * 查询省列表
	 */
	public List listProvince(Map<String, Object> paramMap) throws BossBizException {
		return provinceBiz.listProvince(paramMap);
	}

	/***
	 * 查询城市列表
	 */
	public List listCityBy(Map<String, Object> paramMap) throws BossBizException {
		return provinceBiz.listCityBy(paramMap);
	}

	/***
	 * 查询地区城镇列表
	 */
	public List listTownBy(Map<String, Object> paramMap) throws BossBizException {
		return provinceBiz.listTownBy(paramMap);
	}

	public Province getProvinceByCode(String code) throws BossBizException {
		return provinceBiz.getProvinceByCode(code);
	}

	public City getCityByCode(String code) throws BossBizException {
		return provinceBiz.getCityByCode(code);
	}

	public Town getTownByCode(String code) throws BossBizException {
		return provinceBiz.getTownByCode(code);
	}
	
	
	
}
