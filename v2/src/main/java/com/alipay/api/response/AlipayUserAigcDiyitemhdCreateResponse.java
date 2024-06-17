package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aigc.diyitemhd.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-15 20:26:54
 */
public class AlipayUserAigcDiyitemhdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6653812459613488219L;

	/** 
	 * 多媒体高清图ID
	 */
	@ApiField("hd_image_id")
	private String hdImageId;

	public void setHdImageId(String hdImageId) {
		this.hdImageId = hdImageId;
	}
	public String getHdImageId( ) {
		return this.hdImageId;
	}

}
