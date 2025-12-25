package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.xytile.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 16:53:23
 */
public class AnttechAiCvRsXytileGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3143439667242113657L;

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
