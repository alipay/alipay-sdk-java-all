package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼记录详情
 *
 * @author auto create
 * @since 1.0, 2024-11-13 11:35:55
 */
public class CallRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 7488184379957843285L;

	/**
	 * 触达状态编码
	 */
	@ApiField("contact_status")
	private String contactStatus;

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
	 * 计量单位：minute-分钟
	 */
	@ApiField("meter_unit")
	private String meterUnit;

	/**
	 * 外呼手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public String getContactStatus() {
		return this.contactStatus;
	}
	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
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
