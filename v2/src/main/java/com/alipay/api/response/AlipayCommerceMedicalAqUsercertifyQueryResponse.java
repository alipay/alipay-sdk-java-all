package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.aq.usercertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-04 10:57:43
 */
public class AlipayCommerceMedicalAqUsercertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3128712659286811418L;

	/** 
	 * 用户姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 认证结果
	 */
	@ApiField("certify_state")
	private Boolean certifyState;

	/** 
	 * 手机ha
	 */
	@ApiField("mobile")
	private String mobile;

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

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

	public void setCertifyState(Boolean certifyState) {
		this.certifyState = certifyState;
	}
	public Boolean getCertifyState( ) {
		return this.certifyState;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

}
