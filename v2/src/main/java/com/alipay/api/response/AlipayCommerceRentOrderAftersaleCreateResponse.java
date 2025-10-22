package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.aftersale.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 15:22:34
 */
public class AlipayCommerceRentOrderAftersaleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4467567916621529947L;

	/** 
	 * 支付宝售后单ID
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/** 
	 * 商户外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}
	public String getAftersaleId( ) {
		return this.aftersaleId;
	}

	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}
	public String getOutAftersaleId( ) {
		return this.outAftersaleId;
	}

}
