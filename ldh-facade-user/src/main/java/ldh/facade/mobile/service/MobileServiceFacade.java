package ldh.facade.mobile.service;

import com.alibaba.dubbo.rpc.RpcException;
import com.jcraft.jsch.UserInfo;

import ldh.facade.agent.entity.AgentMerchantRelation;
import ldh.facade.user.entity.MerchantOnline;
import ldh.facade.user.exceptions.UserBizException;


/***
 * @Description: 手机端对外公布接口
 */
public interface MobileServiceFacade {

	/***
	 * @Title: addMobileMerchantInfo 
	 * @Description: 手机端的商户注册
	 * @param @param userInfo
	 * @param @param merchant
	 * @param @param relation
	 * @param @param p2_LoginPwd    设定文件 
	 * @return void    返回类型 
	 * @throws
	 */
	String addMobileMerchantInfo(UserInfo userInfo, MerchantOnline merchant, 
			AgentMerchantRelation relation, String p2_LoginPwd) throws UserBizException, RpcException;
	
	
	
}
