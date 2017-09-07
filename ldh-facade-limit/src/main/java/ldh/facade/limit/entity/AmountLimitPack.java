/**
 * wusc.edu.pay.facade.limit.params.AmountLimitPack.java
 */
package ldh.facade.limit.entity;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import ldh.common.entity.BaseEntity;


/**
 * <li>Title: 金额限制</li>
 */
public class AmountLimitPack extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6316488871917801688L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 最后修改时间
	 */
	private Date lastModifyTime;

	public AmountLimitPack() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
