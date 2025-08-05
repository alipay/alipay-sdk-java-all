package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRoyaltyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.royalty.seller.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 15:47:30
 */
public class AlipayCommerceRentRoyaltySellerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241248296247964159L;

	/** 
	 * 分账详情信息
	 */
	@ApiField("royalty_info")
	private RentRoyaltyInfo royaltyInfo;

	public void setRoyaltyInfo(RentRoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}
	public RentRoyaltyInfo getRoyaltyInfo( ) {
		return this.royaltyInfo;
	}

}
