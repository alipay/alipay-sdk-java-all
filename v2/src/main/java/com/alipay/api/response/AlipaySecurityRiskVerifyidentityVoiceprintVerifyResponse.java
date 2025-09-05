package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.voiceprint.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 19:07:28
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755623138782955677L;

	/** 
	 * 语音识别文本
	 */
	@ApiField("asr_content")
	private String asrContent;

	/** 
	 * 核身长会话ID
	 */
	@ApiField("long_verify_session_id")
	private String longVerifySessionId;

	/** 
	 * 校验结果描述
	 */
	@ApiField("verify_code")
	private String verifyCode;

	/** 
	 * 核身渲染信息
	 */
	@ApiField("verify_data")
	private String verifyData;

	/** 
	 * 校验过程中透出的文案
	 */
	@ApiField("verify_message")
	private String verifyMessage;

	/** 
	 * 核身校验是否通过
	 */
	@ApiField("verify_pass")
	private String verifyPass;

	/** 
	 * 核身会话id
	 */
	@ApiField("verify_session_id")
	private String verifySessionId;

	public void setAsrContent(String asrContent) {
		this.asrContent = asrContent;
	}
	public String getAsrContent( ) {
		return this.asrContent;
	}

	public void setLongVerifySessionId(String longVerifySessionId) {
		this.longVerifySessionId = longVerifySessionId;
	}
	public String getLongVerifySessionId( ) {
		return this.longVerifySessionId;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getVerifyCode( ) {
		return this.verifyCode;
	}

	public void setVerifyData(String verifyData) {
		this.verifyData = verifyData;
	}
	public String getVerifyData( ) {
		return this.verifyData;
	}

	public void setVerifyMessage(String verifyMessage) {
		this.verifyMessage = verifyMessage;
	}
	public String getVerifyMessage( ) {
		return this.verifyMessage;
	}

	public void setVerifyPass(String verifyPass) {
		this.verifyPass = verifyPass;
	}
	public String getVerifyPass( ) {
		return this.verifyPass;
	}

	public void setVerifySessionId(String verifySessionId) {
		this.verifySessionId = verifySessionId;
	}
	public String getVerifySessionId( ) {
		return this.verifySessionId;
	}

}
