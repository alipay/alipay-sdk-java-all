package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.repaynotify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 11:17:42
 */
public class AlipayPcreditHuabeiRepaynotifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8266566554937588757L;

	/** 
	 * true表示打电话
	 */
	@ApiField("do_call")
	private Boolean doCall;

	/** 
	 * 手机号用于打电话用
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 校验不通过原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	/** 
	 * 语音包code，用于拨打电话时使用的语音
	 */
	@ApiField("voice_code")
	private String voiceCode;

	public void setDoCall(Boolean doCall) {
		this.doCall = doCall;
	}
	public Boolean getDoCall( ) {
		return this.doCall;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	public String getUserOpenId( ) {
		return this.userOpenId;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
	}
	public String getVoiceCode( ) {
		return this.voiceCode;
	}

}
