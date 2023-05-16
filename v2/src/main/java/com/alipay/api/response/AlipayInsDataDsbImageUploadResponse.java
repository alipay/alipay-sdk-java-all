package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.dsb.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsDataDsbImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4697753316586536187L;

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
