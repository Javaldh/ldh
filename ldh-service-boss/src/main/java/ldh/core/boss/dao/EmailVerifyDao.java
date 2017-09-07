package ldh.core.boss.dao;

import java.util.Map;

import ldh.common.core.dao.BaseDao;
import ldh.facade.boss.entity.EmailVerify;


/**
 * 
 * @描述: 邮箱验证记录表数据访问层接口.
 */
public interface EmailVerifyDao extends BaseDao<EmailVerify> {

	/**
	 * 根据令牌(token)获取邮箱验证记录.
	 */
	EmailVerify getByToken(String token);

	/**
	 * 批量修改状态
	 */
	int updateStatus(Map<String, Object> paramMap);

}
