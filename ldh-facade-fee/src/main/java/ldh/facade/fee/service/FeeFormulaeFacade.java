package ldh.facade.fee.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.fee.entity.FeeFormula;
import ldh.facade.fee.exceptions.FeeBizException;


/**
 * Desc: 计费公式管理接口
 */
public interface FeeFormulaeFacade {

	/**
	 * 根据条件查询计费公式
	 * 
	 * @param pageParam
	 * @param map
	 * @return
	 */
	PageBean listPage(PageParam pageParam, Map<String, Object> map) throws FeeBizException;

	/**
	 * 新增
	 * 
	 * @param feeFormula
	 */
	void createFeeFormulae(FeeFormula feeFormula) throws FeeBizException;

	/**
	 * 根据ID获取计费公式
	 * 
	 * @param id
	 * @return
	 */
	FeeFormula getById(Long id) throws FeeBizException;

	/**
	 * 更新
	 * 
	 * @param feeFormula
	 */
	void updateFeeFormulae(FeeFormula feeFormula) throws FeeBizException;

	/**
	 * 根据计费方式ID查询出所有计费公式
	 * 
	 * @param calWayId
	 * @return
	 */
	List<FeeFormula> listByCalWayId(Long calWayId) throws FeeBizException;

	/**
	 * 检查计费公式是否唯一
	 * @param feeFormula
	 * @return
	 */
	boolean checkUnique(FeeFormula feeFormula) throws FeeBizException;

}
