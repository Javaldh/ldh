/**
 * 
 */
package ldh.facade.pms.entity;

import ldh.common.entity.BaseEntity;

/**
 * <li>Title:角色菜单关联表</li>
 */
public class PmsRoleMenu extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	/** 角色ID **/
	private Long roleId;
	
	/** 菜单ID **/
	private Long menuId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

}
