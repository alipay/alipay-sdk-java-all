package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-12 15:45:32
 */
public class AlipaySocialBaseContentlibStandardcontentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1455359519453298859L;

	/** 
	 * 状态码。 0-审核中 1-发布成功 2-审核不通过 3-己删除
	 */
	@ApiField("source_status")
	private String sourceStatus;

	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}
	public String getSourceStatus( ) {
		return this.sourceStatus;
	}

}
