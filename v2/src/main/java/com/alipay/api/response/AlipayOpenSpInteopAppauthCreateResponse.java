package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.appauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 10:12:42
 */
public class AlipayOpenSpInteopAppauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6164564545536814793L;

	/** 
	 * 子单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}
	public String getSubOrderNo( ) {
		return this.subOrderNo;
	}

}
