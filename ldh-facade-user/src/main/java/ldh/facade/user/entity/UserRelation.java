package ldh.facade.user.entity;

import ldh.common.entity.BaseEntity;

/**
 * 用户父子关系表
 */
public class UserRelation extends BaseEntity {
	private static final long serialVersionUID = 1L;


	/** 父用户编号 */
	private String parentUserNo;

	/** 子用户编号 */
	private String childUserNo;


	public String getParentUserNo() {
		return parentUserNo;
	}

	public void setParentUserNo(String parentUserNo) {
		this.parentUserNo = parentUserNo;
	}

	public String getChildUserNo() {
		return childUserNo;
	}

	public void setChildUserNo(String childUserNo) {
		this.childUserNo = childUserNo;
	}

}
