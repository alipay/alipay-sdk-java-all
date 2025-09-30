package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenLotteryCampQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6399761286981816431L;

	/** 
	 * 返回结果，活动详情
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
