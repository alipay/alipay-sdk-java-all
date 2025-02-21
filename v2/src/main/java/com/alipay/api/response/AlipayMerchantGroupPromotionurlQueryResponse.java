package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.promotionurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-17 10:46:08
 */
public class AlipayMerchantGroupPromotionurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7769139417337611675L;

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
