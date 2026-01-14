package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.hkmedical.signin response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-24 09:37:42
 */
public class AlipayCommerceMedicalInsuranceHkmedicalSigninResponse extends AlipayResponse {

	private static final long serialVersionUID = 7464369661416638526L;

	/** 
	 * 用户证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 用户证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 支付宝用户的唯一 ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 支付宝用户的唯一 ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyType( ) {
		return this.companyType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
