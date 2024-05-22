package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话详情查询
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:46:09
 */
public class AntfortuneFinresearchSessionDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3158156785263395113L;

	/**
	 * 本次会话的主体ID
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

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

}
