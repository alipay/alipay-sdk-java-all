package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:08
 */
public class AlipayOpenLotteryCampBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4824988398324983182L;

	/** 
	 * 抽奖活动搜索列表
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
