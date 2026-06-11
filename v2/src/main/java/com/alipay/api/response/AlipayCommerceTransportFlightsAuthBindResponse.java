package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.flights.auth.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 14:40:32
 */
public class AlipayCommerceTransportFlightsAuthBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1883113485962366836L;

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
