package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI眼镜声纹核身校验
 *
 * @author auto create
 * @since 1.0, 2025-05-07 17:05:22
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1472763589877475869L;

	/**
	 * base64加密后的语音数据字符串
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
	 * 流程类型
	 */
	@ApiField("flow_data")
	private String flowData;

	/**
	 * 长核身会话id
	 */
	@ApiField("long_verify_session_id")
	private String longVerifySessionId;

	/**
	 * 外部业务id,用于幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 核身会话id，首次校验后返回，关联一次会话
	 */
	@ApiField("verify_session_id")
	private String verifySessionId;

	/**
	 * 语音数据格式类型
	 */
	@ApiField("voice_data_type")
	private String voiceDataType;

	/**
	 * 描述语音交互的步骤
	 */
	@ApiField("voice_verify_step")
	private String voiceVerifyStep;

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

	public String getFlowData() {
		return this.flowData;
	}
	public void setFlowData(String flowData) {
		this.flowData = flowData;
	}

	public String getLongVerifySessionId() {
		return this.longVerifySessionId;
	}
	public void setLongVerifySessionId(String longVerifySessionId) {
		this.longVerifySessionId = longVerifySessionId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getVerifySessionId() {
		return this.verifySessionId;
	}
	public void setVerifySessionId(String verifySessionId) {
		this.verifySessionId = verifySessionId;
	}

	public String getVoiceDataType() {
		return this.voiceDataType;
	}
	public void setVoiceDataType(String voiceDataType) {
		this.voiceDataType = voiceDataType;
	}

	public String getVoiceVerifyStep() {
		return this.voiceVerifyStep;
	}
	public void setVoiceVerifyStep(String voiceVerifyStep) {
		this.voiceVerifyStep = voiceVerifyStep;
	}

}
