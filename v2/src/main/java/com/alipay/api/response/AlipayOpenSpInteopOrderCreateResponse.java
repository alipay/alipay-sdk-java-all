package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 16:32:42
 */
public class AlipayOpenSpInteopOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4624914762667712591L;

	/** 
	 * 一体化作业开通主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}
	public String getInteopOrderNo( ) {
		return this.inteopOrderNo;
	}

}
