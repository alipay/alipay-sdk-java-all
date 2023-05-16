package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:47:22
 */
public class AlipayAssetPointBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6688489132446591941L;

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
