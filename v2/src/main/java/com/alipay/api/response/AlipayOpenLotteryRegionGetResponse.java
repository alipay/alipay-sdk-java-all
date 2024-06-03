package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:21:05
 */
public class AlipayOpenLotteryRegionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5721254797713722756L;

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
