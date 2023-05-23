package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.xytile.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:16:59
 */
public class AnttechAiCvRsXytileGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2725224644619973614L;

	/** 
	 * 图片原始内容
	 */
	@ApiField("image")
	private String image;

	public void setImage(String image) {
		this.image = image;
	}
	public String getImage( ) {
		return this.image;
	}

}
