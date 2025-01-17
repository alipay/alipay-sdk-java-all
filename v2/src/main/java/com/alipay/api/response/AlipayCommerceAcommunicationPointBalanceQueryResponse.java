package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.point.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 21:52:21
 */
public class AlipayCommerceAcommunicationPointBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3774132951844623979L;

	/** 
	 * 用户剩余积分，单位为个
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 当月过期积分数，单位为个
	 */
	@ApiField("to_expired_point")
	private Long toExpiredPoint;

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getBalance( ) {
		return this.balance;
	}

	public void setToExpiredPoint(Long toExpiredPoint) {
		this.toExpiredPoint = toExpiredPoint;
	}
	public Long getToExpiredPoint( ) {
		return this.toExpiredPoint;
	}

}
