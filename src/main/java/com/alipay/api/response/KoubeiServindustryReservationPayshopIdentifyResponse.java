package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.reservation.payshop.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiServindustryReservationPayshopIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629184986565473932L;

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
