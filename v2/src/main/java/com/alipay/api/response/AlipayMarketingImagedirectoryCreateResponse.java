package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.imagedirectory.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-21 15:41:01
 */
public class AlipayMarketingImagedirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4727934772855632968L;

	/** 
	 * 创建后的目录id。
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	public void setImageDirectoryId(String imageDirectoryId) {
		this.imageDirectoryId = imageDirectoryId;
	}
	public String getImageDirectoryId( ) {
		return this.imageDirectoryId;
	}

}
