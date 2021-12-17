package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.identification.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 10:15:16
 */
public class ZhimaCustomerEpIdentificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7339913897995616476L;

	/** 
	 * 认证的企业证件号。
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 认证的企业名。
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 认证不通过的错误码。
	 */
	@ApiField("failed_code")
	private String failedCode;

	/** 
	 * 认证是否通过，通过为true，不通过为false。
	 */
	@ApiField("passed")
	private String passed;

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

	public void setFailedCode(String failedCode) {
		this.failedCode = failedCode;
	}
	public String getFailedCode( ) {
		return this.failedCode;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
