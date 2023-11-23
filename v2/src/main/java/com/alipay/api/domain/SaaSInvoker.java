package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全科技SaaS调用者信息
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class SaaSInvoker extends AlipayObject {

	private static final long serialVersionUID = 8856838697412123415L;

	/**
	 * 阿里云用户ID
	 */
	@ApiField("aliyun_user_id")
	private String aliyunUserId;

	/**
	 * 调用者类型
	 */
	@ApiField("invoker_type")
	private String invokerType;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 用户
	 */
	@ApiField("user")
	private String user;

	/**
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	public String getAliyunUserId() {
		return this.aliyunUserId;
	}
	public void setAliyunUserId(String aliyunUserId) {
		this.aliyunUserId = aliyunUserId;
	}

	public String getInvokerType() {
		return this.invokerType;
	}
	public void setInvokerType(String invokerType) {
		this.invokerType = invokerType;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
