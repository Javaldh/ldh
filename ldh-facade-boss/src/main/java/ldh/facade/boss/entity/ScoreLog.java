package ldh.facade.boss.entity;

import ldh.common.entity.BaseEntity;

/**
 * 类描述：积分日志信息
 */
public class ScoreLog extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7196468013788924670L;

	private String accountNo;// 账户ID
	private Long changeScore;// 变动积分
	private String changeDesc; // 变动积分说明

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Long getChangeScore() {
		return changeScore;
	}

	public void setChangeScore(Long changeScore) {
		this.changeScore = changeScore;
	}

	public String getChangeDesc() {
		return changeDesc;
	}

	public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}
}
