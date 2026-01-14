package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.tpaevent.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 18:12:43
 */
public class AlipayCommerceMedicalInsuranceTpaeventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7531939685136881242L;

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
	 * 被保人证件号
	 */
	@ApiField("insured_cert_no")
	private String insuredCertNo;

	/** 
	 * 被保人证件类型
	 */
	@ApiField("insured_cert_type")
	private String insuredCertType;

	/** 
	 * 被保人姓名
	 */
	@ApiField("insured_name")
	private String insuredName;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

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

	public void setInsuredCertNo(String insuredCertNo) {
		this.insuredCertNo = insuredCertNo;
	}
	public String getInsuredCertNo( ) {
		return this.insuredCertNo;
	}

	public void setInsuredCertType(String insuredCertType) {
		this.insuredCertType = insuredCertType;
	}
	public String getInsuredCertType( ) {
		return this.insuredCertType;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredName( ) {
		return this.insuredName;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}
