package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WatchPromoPrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 10:50:35
 */
public class AlipayPayAppPocketmoneyPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8811177373564462166L;

	/** 
	 * 奖品详情
	 */
	@ApiField("prize_detail")
	private WatchPromoPrizeDetail prizeDetail;

	public void setPrizeDetail(WatchPromoPrizeDetail prizeDetail) {
		this.prizeDetail = prizeDetail;
	}
	public WatchPromoPrizeDetail getPrizeDetail( ) {
		return this.prizeDetail;
	}

}
