package ldh.facade.boss.entity;

import ldh.common.entity.BaseEntity;

/**
 * 类描述：数据库字段管理
 */
public class GlobalSet extends BaseEntity {
	private static final long serialVersionUID = 1L;

	private String setKey;// ID名称
	private String setContent; // 内容
	private String description;// 描述

	public String getSetKey() {
		return setKey;
	}

	public void setSetKey(String setKey) {
		this.setKey = setKey;
	}

	public String getSetContent() {
		return setContent;
	}

	public void setSetContent(String setContent) {
		this.setContent = setContent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
