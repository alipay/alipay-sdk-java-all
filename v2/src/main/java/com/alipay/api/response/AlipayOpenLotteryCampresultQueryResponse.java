package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.campresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:58:48
 */
public class AlipayOpenLotteryCampresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4151639997428494971L;

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
