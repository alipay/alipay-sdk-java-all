package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.usertaxbillsign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-30 19:06:55
 */
public class AlipayCommerceCommonUsertaxbillsignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579681922741995769L;

	/** 
	 * 淘客与税筹公司的签约状态
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
