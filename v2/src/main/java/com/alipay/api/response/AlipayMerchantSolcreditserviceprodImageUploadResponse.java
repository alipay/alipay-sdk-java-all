package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 09:12:13
 */
public class AlipayMerchantSolcreditserviceprodImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8296162897825947598L;

	/** 
	 * 链接地址
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
