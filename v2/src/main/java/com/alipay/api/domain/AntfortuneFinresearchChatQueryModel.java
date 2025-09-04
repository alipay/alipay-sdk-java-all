package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询聊天消息详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:40
 */
public class AntfortuneFinresearchChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3214927885832929515L;

	/**
	 * 合作方内部的用户体系用户信息
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 小助分配给合作方的租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
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
