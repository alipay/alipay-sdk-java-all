package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.logo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 18:12:32
 */
public class ZhimaMerchantCreditserviceLogoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3481456758724196957L;

	/** 
	 * 上传图片后生成的图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
