package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.imagedirectory.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 10:56:59
 */
public class AlipayMarketingImagedirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594448635782751969L;

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
