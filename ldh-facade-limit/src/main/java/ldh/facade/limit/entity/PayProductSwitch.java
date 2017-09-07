/**
 * wusc.edu.pay.facade.limit.params.PayProductSwitch.java
 */
package ldh.facade.limit.entity;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import ldh.common.entity.BaseEntity;
import ldh.facade.limit.enums.SwitchLimitStatusEnum;


/**
 * <li>Title:支付产品开关</li>
 */
public class PayProductSwitch extends BaseEntity {

	private static final long serialVersionUID = -7504877177512688940L;

	/**
	 * 开关限制包Id
	 */
	private Long switchLimitPackId;

	/**
	 * 业务功能
	 */
	private String bizFunction;

	/**
	 * 支付产品
	 */
	private String payProduct;

	/**
	 * 状态
	 */
	private SwitchLimitStatusEnum status;

	/**
	 * 最后修改时间
	 */
	private Date lastModifyTime;

	/**
	 * 用于列表页面展示
	 * 
	 * @return
	 */
	public String getStatusDesc() {
		return this.getStatus() == null ? "" : this.getStatus().getLabel();
	}

	public Long getSwitchLimitPackId() {
		return switchLimitPackId;
	}

	public void setSwitchLimitPackId(Long switchLimitPackId) {
		this.switchLimitPackId = switchLimitPackId;
	}

	public String getBizFunction() {
		return bizFunction;
	}

	public void setBizFunction(String bizFunction) {
		this.bizFunction = bizFunction;
	}

	public String getPayProduct() {
		return payProduct;
	}

	public void setPayProduct(String payProduct) {
		this.payProduct = payProduct;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public SwitchLimitStatusEnum getStatus() {
		return status;
	}

	public void setStatus(SwitchLimitStatusEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
