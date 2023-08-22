package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:06:43
 */
public class AlipayOpenLotteryRegionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713775162426535384L;

	/** 
	 * 入驻商家专区信息
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
