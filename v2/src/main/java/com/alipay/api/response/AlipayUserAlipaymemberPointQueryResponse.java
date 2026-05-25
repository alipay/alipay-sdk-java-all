package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaymember.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 20:17:43
 */
public class AlipayUserAlipaymemberPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1355853954358934855L;

	/** 
	 * 用户积分余额
	 */
	@ApiField("point_balance")
	private Long pointBalance;

	public void setPointBalance(Long pointBalance) {
		this.pointBalance = pointBalance;
	}
	public Long getPointBalance( ) {
		return this.pointBalance;
	}

}
