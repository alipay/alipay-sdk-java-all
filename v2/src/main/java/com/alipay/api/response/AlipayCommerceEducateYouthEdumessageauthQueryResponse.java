package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MessageReceiveVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.youth.edumessageauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 11:51:50
 */
public class AlipayCommerceEducateYouthEdumessageauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1729712342277778658L;

	/** 
	 * 用户授权状态
	 */
	@ApiField("inst_auth_state")
	private Boolean instAuthState;

	/** 
	 * 消息接收状态
	 */
	@ApiField("message_receive_state_list")
	private MessageReceiveVO messageReceiveStateList;

	public void setInstAuthState(Boolean instAuthState) {
		this.instAuthState = instAuthState;
	}
	public Boolean getInstAuthState( ) {
		return this.instAuthState;
	}

	public void setMessageReceiveStateList(MessageReceiveVO messageReceiveStateList) {
		this.messageReceiveStateList = messageReceiveStateList;
	}
	public MessageReceiveVO getMessageReceiveStateList( ) {
		return this.messageReceiveStateList;
	}

}
