package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.smartprice.get response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-19 11:37:53
 */
public class AlipayDataAiserviceSmartpriceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7586589565241321932L;

	/** 
	 * 用户购买hellobike月卡的推荐价格，单位为分。
	 */
	@ApiField("promo_price_cent")
	private Long promoPriceCent;

	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}
	public Long getPromoPriceCent( ) {
		return this.promoPriceCent;
	}

}
