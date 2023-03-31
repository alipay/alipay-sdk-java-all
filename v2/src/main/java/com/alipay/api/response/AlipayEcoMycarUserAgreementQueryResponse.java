package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.user.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:36:43
 */
public class AlipayEcoMycarUserAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1673679982795767367L;

	/** 
	 * 是否进行消息通知
true:进行
fase:进行
	 */
	@ApiField("message_activate")
	private Boolean messageActivate;

	/** 
	 * 是否已经高级认证
true：是
flase：不是
	 */
	@ApiField("senior_certificated")
	private Boolean seniorCertificated;

	public void setMessageActivate(Boolean messageActivate) {
		this.messageActivate = messageActivate;
	}
	public Boolean getMessageActivate( ) {
		return this.messageActivate;
	}

	public void setSeniorCertificated(Boolean seniorCertificated) {
		this.seniorCertificated = seniorCertificated;
	}
	public Boolean getSeniorCertificated( ) {
		return this.seniorCertificated;
	}

}
