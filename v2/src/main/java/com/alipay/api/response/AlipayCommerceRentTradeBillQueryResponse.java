package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentBillRoyaltyDetailDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.trade.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 22:17:36
 */
public class AlipayCommerceRentTradeBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6293967244117891326L;

	/** 
	 * 分账明细
	 */
	@ApiField("rent_royalty_detail")
	private RentBillRoyaltyDetailDto rentRoyaltyDetail;

	public void setRentRoyaltyDetail(RentBillRoyaltyDetailDto rentRoyaltyDetail) {
		this.rentRoyaltyDetail = rentRoyaltyDetail;
	}
	public RentBillRoyaltyDetailDto getRentRoyaltyDetail( ) {
		return this.rentRoyaltyDetail;
	}

}
