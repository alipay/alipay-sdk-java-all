package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.acceptance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 10:39:06
 */
public class ZhimaCreditEpAcceptanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3611318378238173924L;

	/** 
	 * 当前的受理状态
	 */
	@ApiField("acceptance_status")
	private String acceptanceStatus;

	/** 
	 * 统一社会信用代码或营业执照注册号，法人授权可返回
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称，法人授权可返回
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 法人有效证件号码，法人授权后可返回
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/** 
	 * 企业法定代表人姓名，法人授权后可返回
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/** 
	 * 用户联系方式，法人授权后可返回
	 */
	@ApiField("tel_phone")
	private String telPhone;

	/** 
	 * 本次受理的支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setAcceptanceStatus(String acceptanceStatus) {
		this.acceptanceStatus = acceptanceStatus;
	}
	public String getAcceptanceStatus( ) {
		return this.acceptanceStatus;
	}

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}
	public String getLegalPersonCertNo( ) {
		return this.legalPersonCertNo;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getLegalPersonName( ) {
		return this.legalPersonName;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public String getTelPhone( ) {
		return this.telPhone;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
