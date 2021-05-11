package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserUnicomDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5866413898858748733L;

	/** 
	 * 蚂蚁宝卡流量余额，单位M
	 */
	@ApiField("data_balance")
	private Long dataBalance;

	public void setDataBalance(Long dataBalance) {
		this.dataBalance = dataBalance;
	}
	public Long getDataBalance( ) {
		return this.dataBalance;
	}

}
