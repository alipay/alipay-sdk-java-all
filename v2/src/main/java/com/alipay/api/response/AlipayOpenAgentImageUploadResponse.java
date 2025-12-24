package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:28
 */
public class AlipayOpenAgentImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3118995355435678144L;

	/** 
	 * 上传图片返回的图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}
