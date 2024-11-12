package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话详情查询
 *
 * @author auto create
 * @since 1.0, 2024-06-07 11:23:50
 */
public class AntfortuneFinresearchSessionDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7519166133644639985L;

	/**
	 * 合作方内部用户标识这个参数等价于identity_id，如果传了这个参数，会优先生效此参数，identity_id随便传一个即可。这个参数没传的话，identity_id一定要有值
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 本次会话的主体ID, 业务方体系内部的id
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 租户id, 已经分配租户id的请求方请务必要传，否则会造成接口失败
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
