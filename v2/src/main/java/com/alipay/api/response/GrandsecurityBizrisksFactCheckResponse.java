package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: grandsecurity.bizrisks.fact.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-11 10:49:59
 */
public class GrandsecurityBizrisksFactCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8669578447944314534L;

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
