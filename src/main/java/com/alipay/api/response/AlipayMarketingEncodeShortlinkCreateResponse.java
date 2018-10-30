package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.encode.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-19 21:25:27
 */
public class AlipayMarketingEncodeShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7697478264894675674L;

	/** 
	 * 将长连接改写成短连接，改写成功后的短连接地址
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
