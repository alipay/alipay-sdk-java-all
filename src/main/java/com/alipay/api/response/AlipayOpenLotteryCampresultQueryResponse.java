package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.campresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-07 19:35:53
 */
public class AlipayOpenLotteryCampresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6738852719287839838L;

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
