package ldh.facade.boss.entity; 

import ldh.common.entity.BaseEntity;

/**
 *类描述：省份信息表
 */
public class Province extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7128255985673323137L;
	private String provinceNo; //省编号
	private String provinceName;//省名称
	private Integer orders;//排序号
	
	public String getProvinceNo() {
		return provinceNo;
	}
	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public Integer getOrders() {
		return orders;
	}
	public void setOrders(Integer orders) {
		this.orders = orders;
	}
	
}
 