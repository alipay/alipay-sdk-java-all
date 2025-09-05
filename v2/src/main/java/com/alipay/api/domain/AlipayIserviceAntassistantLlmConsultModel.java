package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝大模型对话接口
 *
 * @author auto create
 * @since 1.0, 2023-06-20 16:30:48
 */
public class AlipayIserviceAntassistantLlmConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6183561685814138963L;

	/**
	 * 用户的提问
	 */
	@ApiField("query")
	private String query;

	/**
	 * 多轮会话的唯一标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户信息
	 */
	@ApiField("user")
	private String user;

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

	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
