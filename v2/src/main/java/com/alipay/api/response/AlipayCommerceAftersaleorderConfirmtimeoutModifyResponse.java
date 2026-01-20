package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.aftersaleorder.confirmtimeout.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 15:42:42
 */
public class AlipayCommerceAftersaleorderConfirmtimeoutModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1224351567727148382L;

	/** 
	 * 售后单id
	 */
	@ApiField("aftersales_id")
	private String aftersalesId;

	public void setAftersalesId(String aftersalesId) {
		this.aftersalesId = aftersalesId;
	}
	public String getAftersalesId( ) {
		return this.aftersalesId;
	}

}
