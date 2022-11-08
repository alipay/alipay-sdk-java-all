package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.signinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 10:11:19
 */
public class AlipayCommerceTransportEtcSigninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2145456329592923762L;

	/** 
	 * 支付宝ETC平台代扣协议号，该协议号是经过ETC业务域包装过的，只有该业务域能解析。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/** 
	 * 签约状态的描述。
	 */
	@ApiField("sign_status")
	private String signStatus;

	/** 
	 * 签约状态的枚举Code；
待签约：WAIT_SIGN；
已签约：SIGNED；
已解约：UNSIGN。
	 */
	@ApiField("sign_status_code")
	private String signStatusCode;

	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}
	public String getBizAgreementNo( ) {
		return this.bizAgreementNo;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

	public void setSignStatusCode(String signStatusCode) {
		this.signStatusCode = signStatusCode;
	}
	public String getSignStatusCode( ) {
		return this.signStatusCode;
	}

}
