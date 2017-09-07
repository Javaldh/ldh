package ldh.core.boss.exception;

/**
 * 
 * @描述: Boss运营系统自定义异常类.
 */
public class BossException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3099103384270268627L;
	
	/**
	 * 异常提示信息.
	 */
	public String errMsg;
	
	/**
	 * 默认构造函数.
	 */
	public BossException() {
		super();
	}
	
	/**
	 * 带消息提示构造函数.
	 */
	public BossException(String errMsg) {
		super();
		this.errMsg = errMsg;
	}
}
