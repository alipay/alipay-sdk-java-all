package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.version.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:26
 */
public class AlipayOpenAgentVersionPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 8381994973343933895L;

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
