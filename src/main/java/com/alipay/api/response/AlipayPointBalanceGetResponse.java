package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 19:01:40
 */
public class AlipayPointBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7899913774878939515L;

	/** 
	 * 用户的集分宝余额
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}
	public Long getPointAmount( ) {
		return this.pointAmount;
	}

}
