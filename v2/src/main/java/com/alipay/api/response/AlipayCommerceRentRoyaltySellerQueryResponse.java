package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRoyaltyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.royalty.seller.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 20:27:40
 */
public class AlipayCommerceRentRoyaltySellerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4855897456791143235L;

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
