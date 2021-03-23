package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 14:00:19
 */
public class AlipayOpenSpImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254658817764625134L;

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
