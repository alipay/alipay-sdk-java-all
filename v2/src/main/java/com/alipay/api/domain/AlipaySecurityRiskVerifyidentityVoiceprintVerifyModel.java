package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI眼镜声纹核身校验
 *
 * @author auto create
 * @since 1.0, 2025-06-17 19:05:18
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6651672113734721169L;

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
	 * 长核身会话id，首次调用后返回，如未返回，可忽略
	 */
	@ApiField("long_verify_session_id")
	private String longVerifySessionId;

	/**
	 * 外部业务id,用于幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 标识业务方接入的校验场景：调用方系统名_业务产品_业务产品节点_业务接入渠道
	 */
	@ApiField("scene_id")
	private String sceneId;

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
	 * 描述语音交互的步骤，具体步骤包含：AROUSE("AROUSE", "唤起")
    , PERSISTENT_INTERACTIONS("PERSISTENT_INTERACTIONS", "持续的交互内容")
    , SPECIFIC_CONTENT("SPECIFIC_CONTENT", "指定内容朗读验证")
    , RECOGNIZE_PAY_MONEY("RECOGNIZE_PAY_MONEY", "识别支付金额")
    , PAY_CONFIRM("PAY_CONFIRM", "支付确认")
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

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
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
