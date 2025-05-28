package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.voiceprint.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 17:12:25
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2765584811382217191L;

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
	 * 核身渲染信息
	 */
	@ApiField("verify_data")
	private String verifyData;

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

	public void setVerifyData(String verifyData) {
		this.verifyData = verifyData;
	}
	public String getVerifyData( ) {
		return this.verifyData;
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
