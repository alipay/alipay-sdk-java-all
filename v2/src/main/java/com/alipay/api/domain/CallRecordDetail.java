package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼记录详情
 *
 * @author auto create
 * @since 1.0, 2024-11-25 17:40:40
 */
public class CallRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 8332892872512342383L;

	/**
	 * 通话时长：单位（秒）
	 */
	@ApiField("call_duration")
	private Long callDuration;

	/**
	 * 触达状态编码
	 */
	@ApiField("contact_status")
	private String contactStatus;

	/**
	 * 意图描述
	 */
	@ApiField("intent_description")
	private String intentDescription;

	/**
	 * 触达消息类型 短信 TEXT_SMS_REPORT，ROBOT_CALL 语音
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 电话外呼通话时长
	 */
	@ApiField("meter_num")
	private Long meterNum;

	/**
	 * 计量单位
	 */
	@ApiField("meter_unit")
	private String meterUnit;

	/**
	 * 外呼手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public Long getCallDuration() {
		return this.callDuration;
	}
	public void setCallDuration(Long callDuration) {
		this.callDuration = callDuration;
	}

	public String getContactStatus() {
		return this.contactStatus;
	}
	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
	}

	public String getIntentDescription() {
		return this.intentDescription;
	}
	public void setIntentDescription(String intentDescription) {
		this.intentDescription = intentDescription;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Long getMeterNum() {
		return this.meterNum;
	}
	public void setMeterNum(Long meterNum) {
		this.meterNum = meterNum;
	}

	public String getMeterUnit() {
		return this.meterUnit;
	}
	public void setMeterUnit(String meterUnit) {
		this.meterUnit = meterUnit;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
