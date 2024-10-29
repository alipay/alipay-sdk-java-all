package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.promotionurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 18:09:35
 */
public class AlipayMerchantGroupPromotionurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6292892152467723318L;

	/** 
	 * 群组推广链接
	 */
	@ApiField("promotion_url")
	private String promotionUrl;

	public void setPromotionUrl(String promotionUrl) {
		this.promotionUrl = promotionUrl;
	}
	public String getPromotionUrl( ) {
		return this.promotionUrl;
	}

}
