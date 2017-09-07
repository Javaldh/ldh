/**
 * wusc.edu.pay.facade.user.service.MemberInfoFacade.java
 */
package ldh.facade.user.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.user.entity.MemberInfo;
import ldh.facade.user.exceptions.UserBizException;


/**
 * <li>Title: 会员基本信息对外接口</li>
 */
public interface MemberInfoFacade {
	
	/**
	 * 根据用户编号(也是会员编号)查询会员信息.
	 * @param userNo 用户编号(也是会员编号).
	 * @return memberInfo 查询到的会员信息.
	 * @throws UserBizException
	 */
	public MemberInfo getMemberByUserNo(String userNo) throws UserBizException;

	/**
	 * 分页查询
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 * @throws UserBizException
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws UserBizException;

	/**
	 * 更新会员信息.
	 * @param memberInfo 会员信息.
	 * @return result 更新结果
	 * @throws UserBizException
	 */
	public long update(MemberInfo memberInfo)  throws UserBizException;
	
	/***
	 * 根据ID查询会员信息
	 * @param memberId
	 * @return
	 */
	MemberInfo getById(Long memberId) throws UserBizException;
	
	/**
	 * 统计会员拉黑和冻结的人数
	 * @param listBlackUser
	 * @param listFreezeUser
	 * @return
	 */
	public Map<String, Object> countMember(
			List<Map<String, Object>> listBlackUser,
			List<Map<String, Object>> listFreezeUser) throws UserBizException;

}
