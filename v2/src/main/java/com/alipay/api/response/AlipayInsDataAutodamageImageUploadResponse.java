package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.autodamage.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:35:46
 */
public class AlipayInsDataAutodamageImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1338295744946937996L;

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
