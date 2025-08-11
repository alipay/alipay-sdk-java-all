package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufanlingsanyaowu.yufalingsanyaowu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8818695813678584112L;

	/** 
	 * 10
	 */
	@ApiField("userid")
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

}
