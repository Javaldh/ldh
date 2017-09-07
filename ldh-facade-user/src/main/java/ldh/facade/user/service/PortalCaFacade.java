/**
 * wusc.edu.pay.facade.user.service.PortalCaFacade.java
 */
package ldh.facade.user.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.user.entity.PortalCa;
import ldh.facade.user.exceptions.UserBizException;


/**
 * <li>Title: 用户证书对外接口</li>
 */
public interface PortalCaFacade {

	/**
	 * 保存或更新证书信息.<br/>
	 * 
	 * @param PortalCa
	 * @return
	 */
	public long saveOrUpdateProtalCA(PortalCa portalCa) throws UserBizException;

	/**
	 * 根据用户编号、用户ID、用户类型获取证书列表.<br/>
	 * @param userNo 用户编号.
	 * @param userId 用户ID.
	 * @param userType 用户类型.
	 * @return PortalCaList.
	 */
	public List<PortalCa> listByUserIdAndType(String userNo, Long userId, Integer userType) throws UserBizException;
	
	/**
	 * 
	 * 根据证书ID查询证书信息. <br/>
	 * @param id 证书ID.
	 * @return PortalCa.
	 */
	public PortalCa getProtalCAById(long id) throws UserBizException;

	/**
	 * 查询证书列表
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 * @throws UserBizException
	 */
	public PageBean queryProtalCAListPage(PageParam pageParam, Map<String, Object> paramMap) throws UserBizException;

	/**
	 * 根据ID删除证书信息.
	 * 
	 * @param id 证书ID.
	 * @throws UserBizException
	 */
	public void deleteProtalCA(long id) throws UserBizException;
	
	/**
	 * 根据用户编号获取数字证书列表.<br/>
	 * @param userNo 用户编号.<br/>
	 * @return PortalCaList.
	 * @throws UserBizException
	 */
	public List<PortalCa> listByUserNo(String userNo) throws UserBizException ;

}
