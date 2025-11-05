package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助会话劣势
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:09
 */
public class ZXZSessionDetail extends AlipayObject {

	private static final long serialVersionUID = 5377819596752251822L;

	/**
	 * 合作方用户标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 时间戳，单位：S
	 */
	@ApiField("last_activity_time")
	private Long lastActivityTime;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 这是会话标题，默认使用第一个问题作为会话标题，后续支持修改
	 */
	@ApiField("session_title")
	private String sessionTitle;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public Long getLastActivityTime() {
		return this.lastActivityTime;
	}
	public void setLastActivityTime(Long lastActivityTime) {
		this.lastActivityTime = lastActivityTime;
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
