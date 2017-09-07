package ldh.facade.boss.entity; 

import ldh.common.entity.BaseEntity;

/**
 *类描述：市信息表
 */
public class City extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2862035842792254680L;
	private String provinceNo;//省编号
	private String cityNo;//市编号
	private String cityName;//市名称
	private Integer orders;//排序号
	public String getProvinceNo() {
		return provinceNo;
	}
	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo;
	}
	public String getCityNo() {
		return cityNo;
	}
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getOrders() {
		return orders;
	}
	public void setOrders(Integer orders) {
		this.orders = orders;
	}
	
}
 