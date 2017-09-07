package ldh.facade.boss.exceptions;

import ldh.common.exceptions.BizException;

/**
 * 类描述： BOSS接口异常类
 */
public class BossBizException extends BizException {

	/**
	 * 
	 */

	private static final long serialVersionUID = -3175990411418914329L;

	
	public BossBizException(){}
	public BossBizException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}

	public BossBizException(int code, String msg) {
		super(code, msg);
	}

	public BossBizException(String msg) {
		super(-1, msg);
	}
}
