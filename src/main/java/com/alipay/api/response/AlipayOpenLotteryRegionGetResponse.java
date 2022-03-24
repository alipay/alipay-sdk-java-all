package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-07 19:35:44
 */
public class AlipayOpenLotteryRegionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8553945844384545846L;

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
