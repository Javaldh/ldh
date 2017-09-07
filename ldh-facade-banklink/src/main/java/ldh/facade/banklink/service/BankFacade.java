package ldh.facade.banklink.service;

import java.util.Date;
import java.util.List;

import ldh.facade.banklink.exceptions.BankLinkBizException;
import ldh.facade.banklink.vo.FileDownResult;
import ldh.facade.banklink.vo.NotifyParam;
import ldh.facade.banklink.vo.NotifyResult;
import ldh.facade.banklink.vo.PaymentParam;
import ldh.facade.banklink.vo.PaymentQueryResult;
import ldh.facade.banklink.vo.PaymentResult;
import ldh.facade.banklink.vo.PrePaymentParam;
import ldh.facade.banklink.vo.PrePaymentResult;
import ldh.facade.banklink.vo.RefundNotifyResult;


/**
 * 该接口是用来对外开放的银行相关业务接口
 */
public interface BankFacade {

	/**
	 * 预支付请求
	 */
	PrePaymentResult preparePay(PrePaymentParam prePaymentParam) throws BankLinkBizException;

	/**
	 * 批量支付订单查询
	 */
	List<PaymentQueryResult> periodQuery(String payInterface, Date startTime, Date endTime) throws BankLinkBizException;

	/**
	 * 单笔订单查询
	 */
	PaymentQueryResult query(String payInterface, String bankOrderNo, Date orderTime) throws BankLinkBizException;

	/**
	 * 对账文件下载
	 */
	FileDownResult fileDown(String payInterface, Date fileDate) throws BankLinkBizException;

	/**
	 * 验证支付通知结果
	 */
	NotifyResult verify(NotifyParam param) throws BankLinkBizException;

	/**
	 * 验证退款通知结果
	 */
	RefundNotifyResult refundVerify(NotifyParam param) throws BankLinkBizException;
	
	/**
	 * 支付
	 */
	public PaymentResult pay(PaymentParam paymentParam) throws BankLinkBizException;
}
