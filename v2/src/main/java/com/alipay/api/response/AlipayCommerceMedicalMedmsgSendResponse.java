package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medmsg.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-25 10:12:28
 */
public class AlipayCommerceMedicalMedmsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2136244952221829496L;

	/** 
	 * 内部消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/** 
	 * 模板Code
	 */
	@ApiField("template_code")
	private String templateCode;

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

}
