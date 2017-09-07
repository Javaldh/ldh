package ldh.facade.boss.entity;

import ldh.common.entity.BaseEntity;

/**
 * 类描述：积分信息实体
 */
public class Score extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -713103081203235249L;

	private String accountNo; // 账户ID
	private Long loginScore; // 登录积分

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Long getLoginScore() {
		return loginScore;
	}

	public void setLoginScore(Long loginScore) {
		this.loginScore = loginScore;
	}

}
