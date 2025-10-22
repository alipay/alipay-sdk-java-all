package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.picture.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 19:57:08
 */
public class AlipayCommercePetPictureCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 3167858171567728466L;

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
