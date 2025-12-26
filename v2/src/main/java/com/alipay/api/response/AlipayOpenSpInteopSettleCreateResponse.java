package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.settle.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 10:17:42
 */
public class AlipayOpenSpInteopSettleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8257324444119818177L;

	/** 
	 * 一体化作业子项申请单号
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
