package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:37:52
 */
public class AlipayCommerceAntestReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2644444893471659423L;

	/** 
	 * 测试报告页url
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
