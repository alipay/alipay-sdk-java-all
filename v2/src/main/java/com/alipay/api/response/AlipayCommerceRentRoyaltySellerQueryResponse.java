package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRoyaltyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.royalty.seller.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-11 17:04:47
 */
public class AlipayCommerceRentRoyaltySellerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6119344517556775268L;

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
