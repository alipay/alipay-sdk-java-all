package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.text.voice.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:43:25
 */
public class AlipayEcoTextVoiceTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8279981776133986377L;

	/** 
	 * 阿里云语音编号
	 */
	@ApiField("call_id")
	private String callId;

	/** 
	 * 调用结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 调用结果描述
	 */
	@ApiField("message")
	private String message;

	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallId( ) {
		return this.callId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
