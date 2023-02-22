package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:53:05
 */
public class AlipayOpenSpImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2583291395872592451L;

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
