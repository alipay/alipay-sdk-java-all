package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:51:15
 */
public class AlipayOpenLotteryRegionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7541418479717311347L;

	/** 
	 * 商家入驻专区列表
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
