package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay公用响应头
 *
 * @author auto create
 * @since 1.0, 2020-07-08 11:48:01
 */
public class OpenApiResponseHeader extends AlipayObject {

	private static final long serialVersionUID = 5316486219325882152L;

	/**
	 * 会话id，对应请求中的conversation_id，若请求中conversation_id非空，则该值非空
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 响应id，对应请求中的request_id。如果请求中request_id非空，则response_id非空。
	 */
	@ApiField("response_id")
	private String responseId;

	/**
	 * 自定义状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 状态信息
	 */
	@ApiField("status_message")
	private String statusMessage;

	/**
	 * 子状态码
	 */
	@ApiField("sub_status_code")
	private String subStatusCode;

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getResponseId() {
		return this.responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return this.statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getSubStatusCode() {
		return this.subStatusCode;
	}
	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}

}
