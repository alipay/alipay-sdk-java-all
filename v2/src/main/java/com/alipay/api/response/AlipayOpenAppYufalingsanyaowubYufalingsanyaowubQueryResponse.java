package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufalingsanyaowub.yufalingsanyaowub.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:48:34
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8557124267954493656L;

	/** 
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

	public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}
	public String getYufaa( ) {
		return this.yufaa;
	}

}
