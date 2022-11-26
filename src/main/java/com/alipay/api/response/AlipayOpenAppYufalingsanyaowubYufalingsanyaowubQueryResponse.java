package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufalingsanyaowub.yufalingsanyaowub.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-01 11:36:16
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3867736563853576312L;

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
