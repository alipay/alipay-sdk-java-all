package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.promo.tasklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-04 16:22:08
 */
public class AlipayCommerceTransportPromoTasklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3549638415373843497L;

	/** 
	 * 奖品名称
	 */
	@ApiField("prize")
	private String prize;

	/** 
	 * 奖品价格单位分
	 */
	@ApiField("prize_price")
	private String prizePrice;

	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getPrize( ) {
		return this.prize;
	}

	public void setPrizePrice(String prizePrice) {
		this.prizePrice = prizePrice;
	}
	public String getPrizePrice( ) {
		return this.prizePrice;
	}

}
