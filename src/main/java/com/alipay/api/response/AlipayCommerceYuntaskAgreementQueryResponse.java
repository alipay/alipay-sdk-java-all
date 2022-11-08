package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 19:49:31
 */
public class AlipayCommerceYuntaskAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6675718281568865256L;

	/** 
	 * 签约状态，TEMP：暂存，协议未生效过；NORMAL：正常；STOP：暂停
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
