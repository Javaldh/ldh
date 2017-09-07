package ldh.facade.user.service;

import java.util.List;
import java.util.Map;

import ldh.common.exceptions.BizException;
import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.user.entity.MerchantAction;


/**
 * 商户权限对外接口
 */
public interface MerchantActionFacade {

	/**
	 * 根据商户类型查询该商户类型的所有权限
	 * 
	 * @param merType
	 *            商户类型
	 * @return
	 * @throws BizException
	 */
	List<MerchantAction> listMerActionByMerType(String merType) throws BizException;

	/**
	 * 根据权限的id字符串（以“，”分隔）得到相应的权限列表
	 * 
	 * @param ids
	 * @return
	 */
	List<MerchantAction> listMerchantActionByIdStr(String ids) throws BizException;

	/***
	 * 创建商户权限管理-权限功能点实体.
	 * 
	 * @param entity
	 * @return
	 * @throws BizException
	 */
	long createMerchantAction(MerchantAction entity) throws BizException;

	/***
	 * 修改商户权限管理-权限功能点实体.
	 * 
	 * @param entity
	 * @return
	 * @throws BizException
	 */
	long updateMerchantAction(MerchantAction entity) throws BizException;

	/***
	 * 根据ID查询商户权限管理-权限功能点实体.
	 * 
	 * @param id
	 * @return
	 * @throws BizException
	 */
	MerchantAction getMerchantActionById(long id) throws BizException;

	/****
	 * 查询商户权限管理-权限功能点实体.分页列表
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 * @throws BizException
	 */
	PageBean listPageForMerchantAction(PageParam pageParam, Map<String, Object> paramMap) throws BizException;
}
