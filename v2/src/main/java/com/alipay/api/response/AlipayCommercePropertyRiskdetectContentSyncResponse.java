package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.riskdetect.content.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:27:29
 */
public class AlipayCommercePropertyRiskdetectContentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6383287821888626126L;

	/** 
	 * 支付宝侧内容id
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
