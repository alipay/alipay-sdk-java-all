package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-13 12:03:03
 */
public class AlipayMerchantOrderPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273986813381587937L;

	/** 
	 * 所查询积分类型的积分余额
	 */
	@ApiField("balance")
	private String balance;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

}
