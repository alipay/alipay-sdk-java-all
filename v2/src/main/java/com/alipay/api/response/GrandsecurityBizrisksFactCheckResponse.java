package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: grandsecurity.bizrisks.fact.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 11:24:36
 */
public class GrandsecurityBizrisksFactCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6517438977449525638L;

	/** 
	 * 流式数据返回
	 */
	@ApiField("content")
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

}
