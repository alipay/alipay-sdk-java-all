package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI眼镜声纹核身开通预绑定
 *
 * @author auto create
 * @since 1.0, 2025-04-18 14:21:11
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 3172588223365291963L;

	/**
	 * 用户朗读后的语音数据base64加密后结果
	 */
	@ApiField("base_64_audio_data")
	private String base64AudioData;

	/**
	 * 设备唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 注册数据
	 */
	@ApiField("register_info")
	private String registerInfo;

	/**
	 * 开通时的唯一token,sdk生成
	 */
	@ApiField("register_token")
	private String registerToken;

	/**
	 * 如注册时，外部业务需要指定用户朗读的语音内容，需要传递该文本内容
	 */
	@ApiField("voice_text")
	private String voiceText;

	public String getBase64AudioData() {
		return this.base64AudioData;
	}
	public void setBase64AudioData(String base64AudioData) {
		this.base64AudioData = base64AudioData;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getRegisterInfo() {
		return this.registerInfo;
	}
	public void setRegisterInfo(String registerInfo) {
		this.registerInfo = registerInfo;
	}

	public String getRegisterToken() {
		return this.registerToken;
	}
	public void setRegisterToken(String registerToken) {
		this.registerToken = registerToken;
	}

	public String getVoiceText() {
		return this.voiceText;
	}
	public void setVoiceText(String voiceText) {
		this.voiceText = voiceText;
	}

}
