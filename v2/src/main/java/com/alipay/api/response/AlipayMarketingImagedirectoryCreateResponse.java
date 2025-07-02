package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.imagedirectory.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-24 13:34:56
 */
public class AlipayMarketingImagedirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1432754779972456972L;

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
