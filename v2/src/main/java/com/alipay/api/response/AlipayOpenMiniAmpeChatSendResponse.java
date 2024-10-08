package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.chat.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-28 14:47:07
 */
public class AlipayOpenMiniAmpeChatSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7551112133111968394L;

	/** 
	 * 对话服务的回答，经过编码的字符串，只需要将该响应字符串交由支付宝客户端处理即可。
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 请求流水，回传
	 */
	@ApiField("req_no")
	private String reqNo;

	/** 
	 * 会话id，回传
	 */
	@ApiField("session_id")
	private String sessionId;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}
	public String getReqNo( ) {
		return this.reqNo;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

}
