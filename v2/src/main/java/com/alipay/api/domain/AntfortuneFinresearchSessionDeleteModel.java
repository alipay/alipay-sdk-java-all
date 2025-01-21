package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除会话
 *
 * @author auto create
 * @since 1.0, 2024-06-07 10:41:03
 */
public class AntfortuneFinresearchSessionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1739661933585913246L;

	/**
	 * 合作方用户标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
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
