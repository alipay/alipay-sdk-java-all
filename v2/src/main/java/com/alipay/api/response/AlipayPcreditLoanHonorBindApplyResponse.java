package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.bind.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 15:07:40
 */
public class AlipayPcreditLoanHonorBindApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7596297423153758969L;

	/** 
	 * 准入状态，1-准入成功，0-准入失败
	 */
	@ApiField("access")
	private Long access;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 咨询流水号，准入时有，授信申请提交需要带回
	 */
	@ApiField("credit_consult_serial_no")
	private String creditConsultSerialNo;

	/** 
	 * true-跳过核身 false-需要核身 devmock能力。
	 */
	@ApiField("exempt_verify")
	private Boolean exemptVerify;

	/** 
	 * 准入失败原因码
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 准入失败原因，成功无需返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 授信拒绝管控期天
	 */
	@ApiField("refuse_control_time")
	private Long refuseControlTime;

	/** 
	 * 拒绝原因
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	/** 
	 * 核身url
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setAccess(Long access) {
		this.access = access;
	}
	public Long getAccess( ) {
		return this.access;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setCreditConsultSerialNo(String creditConsultSerialNo) {
		this.creditConsultSerialNo = creditConsultSerialNo;
	}
	public String getCreditConsultSerialNo( ) {
		return this.creditConsultSerialNo;
	}

	public void setExemptVerify(Boolean exemptVerify) {
		this.exemptVerify = exemptVerify;
	}
	public Boolean getExemptVerify( ) {
		return this.exemptVerify;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setRefuseControlTime(Long refuseControlTime) {
		this.refuseControlTime = refuseControlTime;
	}
	public Long getRefuseControlTime( ) {
		return this.refuseControlTime;
	}

	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}
	public String getRefuseMsgData( ) {
		return this.refuseMsgData;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
