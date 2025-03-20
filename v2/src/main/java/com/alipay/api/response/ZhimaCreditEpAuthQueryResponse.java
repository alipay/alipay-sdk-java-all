package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 11:07:24
 */
public class ZhimaCreditEpAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7243357924675857179L;

	/** 
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 法人身份证号
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/** 
	 * 查询公司的法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/** 
	 * 法人手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

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

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

}
