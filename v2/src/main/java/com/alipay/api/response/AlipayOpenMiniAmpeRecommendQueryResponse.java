package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-09 11:02:28
 */
public class AlipayOpenMiniAmpeRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7233948724624648942L;

	/** 
	 * 卡片内容的JS，可直接在浏览器打开。
	 */
	@ApiField("card_url")
	private String cardUrl;

	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public String getCardUrl( ) {
		return this.cardUrl;
	}

}
