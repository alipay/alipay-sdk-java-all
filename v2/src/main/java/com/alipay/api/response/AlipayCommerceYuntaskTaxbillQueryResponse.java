package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.taxbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:31:56
 */
public class AlipayCommerceYuntaskTaxbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1353348393629679766L;

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
