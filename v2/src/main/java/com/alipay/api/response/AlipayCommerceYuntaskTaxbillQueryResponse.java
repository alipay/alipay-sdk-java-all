package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.taxbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 17:26:13
 */
public class AlipayCommerceYuntaskTaxbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3832845178256557319L;

	/** 
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
