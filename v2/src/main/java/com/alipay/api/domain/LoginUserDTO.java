package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与者-租户DTO
 *
 * @author auto create
 * @since 1.0, 2023-03-22 14:27:31
 */
public class LoginUserDTO extends AlipayObject {

	private static final long serialVersionUID = 6455457755388764459L;

	/**
	 * ipRoleId-否-操作员唯一标识-无枚举-被调方返回值-无特殊说明
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * LabelDTO 不唯一 作为map拓展字段 无枚举 调用方提供 无特殊说明
	 */
	@ApiField("tenant_ext_info")
	private LabelDTO tenantExtInfo;

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

	/**
	 * tenant_status 不唯一 表示租户状态 无枚举 被调方提供 无特殊说明
	 */
	@ApiField("tenant_status")
	private String tenantStatus;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public LabelDTO getTenantExtInfo() {
		return this.tenantExtInfo;
	}
	public void setTenantExtInfo(LabelDTO tenantExtInfo) {
		this.tenantExtInfo = tenantExtInfo;
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

	public String getTenantStatus() {
		return this.tenantStatus;
	}
	public void setTenantStatus(String tenantStatus) {
		this.tenantStatus = tenantStatus;
	}

}
