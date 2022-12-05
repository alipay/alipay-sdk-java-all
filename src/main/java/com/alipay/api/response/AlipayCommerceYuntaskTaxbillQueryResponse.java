package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.taxbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-30 15:24:49
 */
public class AlipayCommerceYuntaskTaxbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5351684893879898264L;

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
