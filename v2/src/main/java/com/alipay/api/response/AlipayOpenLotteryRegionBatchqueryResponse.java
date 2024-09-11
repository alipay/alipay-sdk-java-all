package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenLotteryRegionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3842724877141763862L;

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
