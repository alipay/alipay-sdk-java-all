package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-20 15:02:05
 */
public class AlipayMarketingMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3123213221158627446L;

	/** 
	 * 图片唯一资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

}
