package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.autodamage.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:16:18
 */
public class AlipayInsDataAutodamageImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8521422622323431837L;

	/** 
	 * 图像文件在oss存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImagePath( ) {
		return this.imagePath;
	}

}
