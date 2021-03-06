package ldh.facade.boss.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.boss.biz.EmailBiz;
import ldh.facade.boss.entity.EmailVerify;
import ldh.facade.boss.exceptions.BossBizException;
import ldh.facade.boss.service.EmailFacade;


/**
 * @描述: 邮件功能对外服务接口实现类.
 */
@Component("emailFacade")
public class EmailFacadeImpl implements EmailFacade {

	@Autowired
	private EmailBiz emailBiz;

	/**
	 * 创建邮箱验证记录.
	 */

	public long createEmailVerify(EmailVerify entity) {
		return emailBiz.createEmailVerify(entity);
	}

	/**
	 * 更新邮箱验证记录.
	 */

	public long updateEmailVerify(EmailVerify entity) {
		return emailBiz.updateEmailVerify(entity);
	}

	/**
	 * 根据ID获取邮箱验证记录.
	 */

	public EmailVerify getEmailVerifyById(long id) {
		return emailBiz.getEmailVerifyById(id);
	}

	/**
	 * 根据令牌(token)获取邮箱验证记录.
	 */

	public EmailVerify getEmailVerifyByToken(String token) {
		return emailBiz.getEmailVerifyByToken(token);
	}

	/**
	 * 分页查询邮箱验证记录.
	 */
	public PageBean queryEmailVerifyListPage(PageParam pageParam, Map<String, Object> paramMap) {
		return emailBiz.queryEmailVerifyListPage(pageParam, paramMap);
	}

	/***
	 * 根据条件查询邮箱验证记录
	 */
	@SuppressWarnings("rawtypes")
	public List listModelByCondition(Map<String, Object> paramMap) throws BossBizException {
		return emailBiz.listModelByCondition(paramMap);
	}

	@Override
	public long updateStatus(Map<String, Object> paramMap) {
		return emailBiz.updateStatus(paramMap);
	}
}
