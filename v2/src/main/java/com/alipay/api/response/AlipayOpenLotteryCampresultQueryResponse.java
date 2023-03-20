package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.campresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:51:04
 */
public class AlipayOpenLotteryCampresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3387315839473624381L;

	/** 
	 * 中奖结果名单
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
