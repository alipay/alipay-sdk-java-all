package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.version.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 10:57:29
 */
public class AlipayOpenAgentVersionPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 1638748527174427415L;

	/** 
	 * 预览链接
	 */
	@ApiField("preview_url")
	private String previewUrl;

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getPreviewUrl( ) {
		return this.previewUrl;
	}

}
