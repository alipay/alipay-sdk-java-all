package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.reservation.payshop.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:59:34
 */
public class KoubeiServindustryReservationPayshopIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7648899474926513747L;

	/** 
	 * 是否付费店铺
	 */
	@ApiField("pay_shop")
	private Boolean payShop;

	public void setPayShop(Boolean payShop) {
		this.payShop = payShop;
	}
	public Boolean getPayShop( ) {
		return this.payShop;
	}

}
