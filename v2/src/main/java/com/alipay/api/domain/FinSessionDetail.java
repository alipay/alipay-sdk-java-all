package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话详情
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:45:53
 */
public class FinSessionDetail extends AlipayObject {

	private static final long serialVersionUID = 7745619434386538415L;

	/**
	 * 会话其他信息
	 */
	@ApiField("additional_args")
	private FinAdditionArgs additionalArgs;

	/**
	 * 本次会话的主体ID
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 秒级别
	 */
	@ApiField("last_active_time")
	private String lastActiveTime;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 默认取最近一次用户query
	 */
	@ApiField("session_title")
	private String sessionTitle;

	public FinAdditionArgs getAdditionalArgs() {
		return this.additionalArgs;
	}
	public void setAdditionalArgs(FinAdditionArgs additionalArgs) {
		this.additionalArgs = additionalArgs;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getLastActiveTime() {
		return this.lastActiveTime;
	}
	public void setLastActiveTime(String lastActiveTime) {
		this.lastActiveTime = lastActiveTime;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionTitle() {
		return this.sessionTitle;
	}
	public void setSessionTitle(String sessionTitle) {
		this.sessionTitle = sessionTitle;
	}

}
