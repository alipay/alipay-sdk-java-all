package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:01:58
 */
public class AlipayOpenAppTestGraySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6278149479655139774L;

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
