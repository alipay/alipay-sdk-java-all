package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.preconsult.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class AlipayCommerceAcommunicationCreditphonePreconsultSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5445364269466283877L;

	/** 
	 * 请求流水号（代表受理）
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

}
