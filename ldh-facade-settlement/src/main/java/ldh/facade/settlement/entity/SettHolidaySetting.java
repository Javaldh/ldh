package ldh.facade.settlement.entity;

import java.util.Date;

import ldh.common.entity.BaseEntity;


/**
 * 节假日设置实体
 */
public class SettHolidaySetting extends BaseEntity {
	/**
	 * 实例化
	 */
	private static final long serialVersionUID = -713114421635253515L;

	/** 节假日 **/
	private Date holiday;

	/** 描述 **/
	private String remark;

	/**
	 * 节假日
	 * 
	 * @return
	 */
	public Date getHoliday() {
		return holiday;
	}

	/**
	 * 节假日
	 * 
	 * @param holiday
	 */
	public void setHoliday(Date holiday) {
		this.holiday = holiday;
	}

	/**
	 * 描述
	 * 
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 描述
	 * 
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}