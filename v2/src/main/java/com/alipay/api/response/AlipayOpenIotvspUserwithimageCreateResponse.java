package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithimage.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-08 15:56:57
 */
public class AlipayOpenIotvspUserwithimageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755721558829193296L;

	/** 
	 * 用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
