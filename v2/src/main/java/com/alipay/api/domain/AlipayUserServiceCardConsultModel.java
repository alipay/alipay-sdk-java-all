package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AHA服务卡片预咨询
 *
 * @author auto create
 * @since 1.0, 2025-12-29 15:32:42
 */
public class AlipayUserServiceCardConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5145197288115427819L;

	/**
	 * 上下文信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 上下文id
	 */
	@ApiField("context_id")
	private String contextId;

	/**
	 * 意图场景
	 */
	@ApiField("intent")
	private String intent;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 原始query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public String getIntent() {
		return this.intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
