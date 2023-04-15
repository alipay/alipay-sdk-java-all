package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.xytile.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-13 17:41:52
 */
public class AnttechAiCvRsXytileGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1263221695573128313L;

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
