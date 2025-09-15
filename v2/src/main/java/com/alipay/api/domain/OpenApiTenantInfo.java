package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:05:56
 */
public class OpenApiTenantInfo extends AlipayObject {

	private static final long serialVersionUID = 8169882287913579357L;

	/**
	 * 租户状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 描述
	 */
	@ApiField("tenant_desc")
	private String tenantDesc;

	/**
	 * 租户名称
	 */
	@ApiField("tenant_name")
	private String tenantName;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantDesc() {
		return this.tenantDesc;
	}
	public void setTenantDesc(String tenantDesc) {
		this.tenantDesc = tenantDesc;
	}

	public String getTenantName() {
		return this.tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
