package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标注返回的流式结构内容
 *
 * @author auto create
 * @since 1.0, 2025-04-17 15:32:28
 */
public class AmpeChatContent extends AlipayObject {

	private static final long serialVersionUID = 8425965391567374359L;

	/**
	 * 返回生成对话
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用户的会话流水，代表用户的一次query
	 */
	@ApiField("req_no")
	private String reqNo;

	/**
	 * 会话id，代表用户一个完整的会话周期，用户串联用户会话的上下文，需要有过期机制，以避免会话过长。不同sessionId下的会话相互隔离。
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getReqNo() {
		return this.reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
