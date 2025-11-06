package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aigc.diyitemhd.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 13:53:15
 */
public class AlipayUserAigcDiyitemhdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5555581372376231181L;

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
