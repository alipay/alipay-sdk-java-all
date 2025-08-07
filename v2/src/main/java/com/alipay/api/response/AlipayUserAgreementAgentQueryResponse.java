package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 14:17:37
 */
public class AlipayUserAgreementAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1388421939817986422L;

	/** 
	 * 【描述】支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，如果传了该参数，其他参数会被忽略
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中 唯一)。 格式规则:支持大写小写字母和数字，最长 32 位。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 用户在商户侧的唯一标识。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 用户在商户侧的唯一标识。
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/** 
	 * 协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("invalid_time")
	private Date invalidTime;

	/** 
	 * 协议当前状态 1. TEMP：暂存，协议未生效过； 2. NORMAL：正常； 3. STOP：暂停
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_time")
	private Date validTime;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}
	public String getExternalAgreementNo( ) {
		return this.externalAgreementNo;
	}

	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}
	public String getExternalLogonId( ) {
		return this.externalLogonId;
	}

	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	public String getExternalUserId( ) {
		return this.externalUserId;
	}

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}
	public Date getInvalidTime( ) {
		return this.invalidTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}
	public Date getValidTime( ) {
		return this.validTime;
	}

}
