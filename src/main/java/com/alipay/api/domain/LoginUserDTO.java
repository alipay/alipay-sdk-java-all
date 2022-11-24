package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与者-租户DTO
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:24:49
 */
public class LoginUserDTO extends AlipayObject {

	private static final long serialVersionUID = 5118564426611699643L;

	/**
	 * ipRoleId-否-操作员唯一标识-无枚举-被调方返回值-无特殊说明
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * tenantId-否-租户唯一标识-无枚举-被调方返回值-无特殊说明
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * tenantName-否-租户名称-无枚举-被调方返回值-无特殊说明
	 */
	@ApiField("tenant_name")
	private String tenantName;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return this.tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

}
