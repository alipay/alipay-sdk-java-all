package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aigc.aipicture.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:56:44
 */
public class AlipayUserAigcAipictureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8357244571231418942L;

	/** 
	 * 高清图图片ID
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
