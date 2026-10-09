package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-09 15:27:54
 */
public class NfcPointRefreshVoiceResource extends AlipayObject {

	private static final long serialVersionUID = 3271917611788825961L;

	/**
	 * 语音适配的设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 语音对应的图片展示点位
	 */
	@ApiField("voice_position")
	private String voicePosition;

	/**
	 * 语音文件地址
	 */
	@ApiField("voice_url")
	private String voiceUrl;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getVoicePosition() {
		return this.voicePosition;
	}
	public void setVoicePosition(String voicePosition) {
		this.voicePosition = voicePosition;
	}

	public String getVoiceUrl() {
		return this.voiceUrl;
	}
	public void setVoiceUrl(String voiceUrl) {
		this.voiceUrl = voiceUrl;
	}

}
