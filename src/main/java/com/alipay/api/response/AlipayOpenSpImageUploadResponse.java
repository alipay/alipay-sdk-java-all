package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-26 13:57:18
 */
public class AlipayOpenSpImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7656828761268619451L;

	/** 
	 * 图片在文件存储平台的标识
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
