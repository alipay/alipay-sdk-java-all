package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.alipay.ama.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 14:57:40
 */
public class AlipayAlipayAmaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1752224697678282121L;

	/** 
	 * 返回文本内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 流式结束
	 */
	@ApiField("finished")
	private Boolean finished;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	public Boolean getFinished( ) {
		return this.finished;
	}

}
