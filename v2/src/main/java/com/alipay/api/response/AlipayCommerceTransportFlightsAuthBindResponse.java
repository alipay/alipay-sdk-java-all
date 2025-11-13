package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.flights.auth.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 13:47:37
 */
public class AlipayCommerceTransportFlightsAuthBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8553756184984738361L;

	/** 
	 * 外部业务号，唯一标志本次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
