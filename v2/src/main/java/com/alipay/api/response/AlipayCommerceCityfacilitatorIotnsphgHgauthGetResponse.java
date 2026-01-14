package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.iotnsphg.hgauth.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-16 10:17:30
 */
public class AlipayCommerceCityfacilitatorIotnsphgHgauthGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5612934486979589968L;

	/** 
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 授权信息
	 */
	@ApiField("auth_content")
	private String authContent;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAuthContent(String authContent) {
		this.authContent = authContent;
	}
	public String getAuthContent( ) {
		return this.authContent;
	}

}
