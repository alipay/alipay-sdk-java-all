package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:46:00
 */
public class AlipayOpenLotteryCampBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4484721391595729934L;

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
