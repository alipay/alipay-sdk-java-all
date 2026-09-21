package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-20 10:07:53
 */
public class VoiceContent extends AlipayObject {

	private static final long serialVersionUID = 2625469979293937596L;

	/**
	 * 发音人
	 */
	@ApiField("speaker")
	private String speaker;

	/**
	 * 语音触点
	 */
	@ApiField("touchpoint_type")
	private String touchpointType;

	/**
	 * 语音播报文案
	 */
	@ApiField("voice_text")
	private String voiceText;

	public String getSpeaker() {
		return this.speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getTouchpointType() {
		return this.touchpointType;
	}
	public void setTouchpointType(String touchpointType) {
		this.touchpointType = touchpointType;
	}

	public String getVoiceText() {
		return this.voiceText;
	}
	public void setVoiceText(String voiceText) {
		this.voiceText = voiceText;
	}

}
