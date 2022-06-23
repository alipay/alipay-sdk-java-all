package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-07 19:36:16
 */
public class AlipayOpenLotteryCampQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4592432576681571957L;

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
