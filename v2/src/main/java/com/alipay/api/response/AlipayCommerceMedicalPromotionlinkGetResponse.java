package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.promotionlink.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 17:21:36
 */
public class AlipayCommerceMedicalPromotionlinkGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2355985154243783981L;

	/** 
	 * 推广短链
	 */
	@ApiField("promotion_link")
	private String promotionLink;

	public void setPromotionLink(String promotionLink) {
		this.promotionLink = promotionLink;
	}
	public String getPromotionLink( ) {
		return this.promotionLink;
	}

}
