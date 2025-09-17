package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentBillRoyaltyDetailDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.trade.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 12:12:38
 */
public class AlipayCommerceRentTradeBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1676544849982451377L;

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
