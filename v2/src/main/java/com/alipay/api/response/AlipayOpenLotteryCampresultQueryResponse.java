package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.campresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:15:12
 */
public class AlipayOpenLotteryCampresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1421587972313742983L;

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
