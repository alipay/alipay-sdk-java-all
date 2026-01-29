package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.agent.voice.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-09 10:27:43
 */
public class AlipayPayAgentVoiceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1887199986969453432L;

	/** 
	 * 唯一标识一次语音上传的会话，当商户与支付宝有多次语音上传交互时，首次会新生成，后续带上该字段可以关联本次语音上传的会话上下文
	 */
	@ApiField("agent_voice_sid")
	private String agentVoiceSid;

	public void setAgentVoiceSid(String agentVoiceSid) {
		this.agentVoiceSid = agentVoiceSid;
	}
	public String getAgentVoiceSid( ) {
		return this.agentVoiceSid;
	}

}
