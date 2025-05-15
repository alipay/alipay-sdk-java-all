package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.vesion.preview response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 18:10:37
 */
public class AlipayOpenAgentVesionPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 1278338587285275862L;

	/** 
	 * 二维码预览链接
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
