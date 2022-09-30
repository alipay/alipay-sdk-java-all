package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.reservation.payshop.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-22 10:00:54
 */
public class KoubeiServindustryReservationPayshopIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2213448536234935163L;

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
