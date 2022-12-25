package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭会话
 *
 * @author auto create
 * @since 1.0, 2021-08-27 09:57:25
 */
public class AlipayIserviceCliveConnectCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6472661565917824396L;

	/**
	 * 若是会话已经建立，关闭时必须传该conversation_id来请求关闭。若未建立，传visitor_token来请求关闭。
visitor_token 和 conversation_id 不能同时为空。
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 访问DT的渠道
11:LINKS
12:HELLO_BIKE
	 */
	@ApiField("src")
	private String src;

	/**
	 * DT端定义的访客token，标识唯一的访客，在connect成功的时候有给发起方返回。若是会话未建立，关闭时传该token进行关闭。visitor_token 和 conversation_id 不能同时为空。
	 */
	@ApiField("visitor_token")
	private String visitorToken;

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getSrc() {
		return this.src;
	}
	public void setSrc(String src) {
		this.src = src;
	}

	public String getVisitorToken() {
		return this.visitorToken;
	}
	public void setVisitorToken(String visitorToken) {
		this.visitorToken = visitorToken;
	}

}
