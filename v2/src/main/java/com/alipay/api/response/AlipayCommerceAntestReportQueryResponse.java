package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:38:46
 */
public class AlipayCommerceAntestReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1299483814522683313L;

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
