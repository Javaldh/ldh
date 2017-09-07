package ldh.facade.remit.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.remit.entity.RemitBankInfo;
import ldh.facade.remit.exceptions.RemitBizException;


/**
 * @Title: 银行信息服务接口 
 */
public interface RemitBankInfoFacade {
	/**
	 * @Title: 创建银行信息
	 * @Description:  
	 * @param @param remitBankInfo
	 * @param @return
	 * @param @throws RemitBizException    
	 * @return long  
	 * @throws
	 */
	public long create(RemitBankInfo remitBankInfo) throws RemitBizException; 
	
	/**
	 * @Title: 修改银行信息
	 * @Description:  
	 * @param @param remitBankInfo
	 * @param @return
	 * @param @throws RemitBizException    
	 * @return int  
	 * @throws
	 */
	public long update(RemitBankInfo remitBankInfo) throws RemitBizException;
	
	/**
	 * @Title: 分页查询银行信息 
	 * @Description:  
	 * @param @param pageParam
	 * @param @param paramMap
	 * @param @return
	 * @param @throws RemitBizException    
	 * @return PageBean  
	 * @throws
	 */
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws RemitBizException;
    
    /**
     * @Title: 根据ID获取银行信息 
     * @Description: 
     * @param @param id
     * @param @return
     * @param @throws RemitBizException    
     * @return RemitBankInfo  
     * @throws
     */
    public RemitBankInfo getById(long id) throws RemitBizException;
    
    /**
     * @Title: listAll 
     * @Description:查询所有银行信息
     * @param @return
     * @param @throws RemitBizException    
     * @return List<RemitBankInfo>  
     * @throws
     */
    public List<RemitBankInfo> listAll() throws RemitBizException;
    
    /**
     * @Title: 根据ID删除银行信息 
     * @Description: 
     * @param @param id
     * @param @throws RemitBizException    
     * @return void  
     * @throws
     */
    public void deleteById(long id) throws RemitBizException; 
    
    /**
     * @Title: 根据银行行别编号查询银行信息  
     * @Description: 
     * @param @param bankTypeCode
     * @param @return
     * @param @throws RemitBizException    
     * @return List<RemitBankInfo>  
     * @throws
     */
    public List<RemitBankInfo> listByBankTypeCodeAndArea(String bankTypeCode,String province,String city) throws RemitBizException;
    
    /**
     * @Title: 根据银行行号查询银行信息 
     * @Description: 
     * @param @param bankChannelNo
     * @param @return
     * @param @throws RemitBizException    
     * @return RemitBankInfo  
     * @throws
     */
    public RemitBankInfo getByBankChannelNo(String bankChannelNo) throws RemitBizException; 
    
    /**
     * @Title: 根据银行名称模糊查询银行信息 
     * @Description: 
     * @param @param bankName
     * @param @return
     * @param @throws RemitBizException    
     * @return List<RemitBankInfo>  
     * @throws
     */
    public List<RemitBankInfo> listByBankName(String bankName) throws RemitBizException;
}
