package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: amap.map.mapservice.app.openbizmock.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-14 19:51:59
 */
public class AmapMapMapserviceAppOpenbizmockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7214531426534369863L;

	/** 
	 * 内容
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
