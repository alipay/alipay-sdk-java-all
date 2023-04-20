package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-10 17:26:44
 */
public class AlipayOpenAppTestGraySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3424449178364285353L;

	/** 
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
