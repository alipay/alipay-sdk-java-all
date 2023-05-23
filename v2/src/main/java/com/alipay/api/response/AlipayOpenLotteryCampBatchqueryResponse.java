package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:07:37
 */
public class AlipayOpenLotteryCampBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3395624423253858723L;

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
