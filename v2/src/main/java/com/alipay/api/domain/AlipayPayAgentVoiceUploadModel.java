package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体代理支付语音上传
 *
 * @author auto create
 * @since 1.0, 2026-01-09 10:27:43
 */
public class AlipayPayAgentVoiceUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5238319992593782377L;

	/**
	 * 首次调用后返回，关联一次会话（存在多次语音上传交互时，后续带上该字段可以关联本次语音上传的会话上下文）
	 */
	@ApiField("agent_voice_sid")
	private String agentVoiceSid;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * base64加密后的语音数据字符串
	 */
	@ApiField("base_64_audio_data")
	private String base64AudioData;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 业务场景，由支付宝分配，用于调用管控和定制化处理
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 语音数据格式类型
	 */
	@ApiField("voice_data_type")
	private String voiceDataType;

	/**
	 * 描述语音交互的步骤，具体步骤包含：
唤起（AROUSE）
识别支付金额（RECOGNIZE_PAY_MONEY）
确认支付（PAY_CONFIRM）
	 */
	@ApiField("voice_verify_step")
	private String voiceVerifyStep;

	public String getAgentVoiceSid() {
		return this.agentVoiceSid;
	}
	public void setAgentVoiceSid(String agentVoiceSid) {
		this.agentVoiceSid = agentVoiceSid;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBase64AudioData() {
		return this.base64AudioData;
	}
	public void setBase64AudioData(String base64AudioData) {
		this.base64AudioData = base64AudioData;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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
