package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业助手对话
 *
 * @author auto create
 * @since 1.0, 2026-06-08 16:47:56
 */
public class AlipayEbppJobagentChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 1292386178982287132L;

	/**
	 * 用户输入内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
