package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.logo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 11:28:50
 */
public class ZhimaMerchantCreditserviceLogoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4525445391797862297L;

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
