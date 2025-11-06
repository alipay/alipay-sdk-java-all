package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufanlingsanyaowu.yufalingsanyaowu.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:37:37
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3668756571743633326L;

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
