package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercardmsg.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:07:24
 */
public class AlipayEbppCommunityOwnercardmsgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3484555917283532738L;

	/** 
	 * 支付宝消息id
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
