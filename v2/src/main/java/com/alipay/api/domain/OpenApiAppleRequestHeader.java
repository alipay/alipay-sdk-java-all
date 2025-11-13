package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay共用请求头
 *
 * @author auto create
 * @since 1.0, 2020-07-08 11:47:48
 */
public class OpenApiAppleRequestHeader extends AlipayObject {

	private static final long serialVersionUID = 7815818466781561399L;

	/**
	 * 会话id，一般会在响应中带回给商户。
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 请求id，一般会在相应中带回给商户
	 */
	@ApiField("request_id")
	private String requestId;

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
