/**
 * package wusc.edu.pay.facade.limit.params.BizFunctionParamConfig.java
 */
package ldh.facade.limit.entity;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import ldh.common.entity.BaseEntity;


/**
 * <li>Title:业务功能参数配置Entity</li>
 */
public class BizFunctionParamConfig extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -657156215882867036L;

	/**
	 * 商户号
	 */
	private String merchantNo;

	/**
	 * 业务功能
	 */
	private String bizFunction;

	/**
	 * 参数名
	 */
	private String paramName;

	/**
	 * 参数值
	 */
	private String paramValue;

	/**
	 * 最后修改时间
	 */
	private Date lastModifyTime;

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getBizFunction() {
		return bizFunction;
	}

	public void setBizFunction(String bizFunction) {
		this.bizFunction = bizFunction;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
