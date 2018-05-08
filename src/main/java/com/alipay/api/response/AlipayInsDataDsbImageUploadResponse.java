package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.dsb.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-11-10 14:37:15
 */
public class AlipayInsDataDsbImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8225844722858915747L;

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
