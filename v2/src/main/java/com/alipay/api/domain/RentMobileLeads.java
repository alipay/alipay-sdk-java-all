package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电话留咨线索信息
 *
 * @author auto create
 * @since 1.0, 2025-05-07 14:36:41
 */
public class RentMobileLeads extends AlipayObject {

	private static final long serialVersionUID = 2275338699648439932L;

	/**
	 * 通话的时间长度
	 */
	@ApiField("call_duration")
	private String callDuration;

	/**
	 * 通话记录ID
	 */
	@ApiField("call_id")
	private String callId;

	/**
	 * 供服务商/商家向二房东展示的回拨入口
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 该号码为被叫手机上显示的号码
	 */
	@ApiField("caller_number")
	private String callerNumber;

	/**
	 * 是否接通
	 */
	@ApiField("connected")
	private String connected;

	/**
	 * 录音下载URL的有效期是7天。
	 */
	@ApiField("record_url")
	private String recordUrl;

	public String getCallDuration() {
		return this.callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}

	public String getCallId() {
		return this.callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCallerNumber() {
		return this.callerNumber;
	}
	public void setCallerNumber(String callerNumber) {
		this.callerNumber = callerNumber;
	}

	public String getConnected() {
		return this.connected;
	}
	public void setConnected(String connected) {
		this.connected = connected;
	}

	public String getRecordUrl() {
		return this.recordUrl;
	}
	public void setRecordUrl(String recordUrl) {
		this.recordUrl = recordUrl;
	}

}
