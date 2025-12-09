package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.aftersales.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 16:52:26
 */
public class AlipayCommerceMerchantcardAftersalesConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4341744764776871281L;

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
