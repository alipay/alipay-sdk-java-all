package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈易联云设置音量接口
 *
 * @author auto create
 * @since 1.0, 2019-10-17 19:22:19
 */
public class AlipayDataSoundSetModel extends AlipayObject {

	private static final long serialVersionUID = 7548315254875369968L;

	/**
	 * 应用token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 应用id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用秘钥
	 */
	@ApiField("client_secret")
	private String clientSecret;

	/**
	 * 设备sn号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 音量
	 */
	@ApiField("voice")
	private Long voice;

	/**
	 * 蜂鸣器
	 */
	@ApiField("voice_type")
	private String voiceType;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Long getVoice() {
		return this.voice;
	}
	public void setVoice(Long voice) {
		this.voice = voice;
	}

	public String getVoiceType() {
		return this.voiceType;
	}
	public void setVoiceType(String voiceType) {
		this.voiceType = voiceType;
	}

}
