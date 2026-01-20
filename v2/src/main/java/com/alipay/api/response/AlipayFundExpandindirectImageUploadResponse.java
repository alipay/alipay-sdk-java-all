package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.expandindirect.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-29 15:57:37
 */
public class AlipayFundExpandindirectImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5684511167399763743L;

	/** 
	 * 文件在平台上传的标识，比如oss的key
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
