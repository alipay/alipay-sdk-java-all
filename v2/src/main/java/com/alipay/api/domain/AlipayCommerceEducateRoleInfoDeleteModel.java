package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除角色
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:59
 */
public class AlipayCommerceEducateRoleInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2828838659949382195L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
