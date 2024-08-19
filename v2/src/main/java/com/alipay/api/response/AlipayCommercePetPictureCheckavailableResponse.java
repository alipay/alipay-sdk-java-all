package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.picture.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 15:32:06
 */
public class AlipayCommercePetPictureCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 7395235834956533695L;

	/** 
	 * 核验通过的文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}
