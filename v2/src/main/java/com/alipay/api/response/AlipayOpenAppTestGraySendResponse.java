package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:21:50
 */
public class AlipayOpenAppTestGraySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4624585648495662556L;

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
