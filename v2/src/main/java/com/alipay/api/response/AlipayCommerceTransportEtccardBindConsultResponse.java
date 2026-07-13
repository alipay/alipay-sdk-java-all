package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etccard.bind.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 19:37:57
 */
public class AlipayCommerceTransportEtccardBindConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6423758173645954387L;

	/** 
	 * 资格校验结果
	 */
	@ApiField("check_result")
	private String checkResult;

	/** 
	 * 资格校验完成后返回认证token
	 */
	@ApiField("consult_token")
	private String consultToken;

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResult( ) {
		return this.checkResult;
	}

	public void setConsultToken(String consultToken) {
		this.consultToken = consultToken;
	}
	public String getConsultToken( ) {
		return this.consultToken;
	}

}
