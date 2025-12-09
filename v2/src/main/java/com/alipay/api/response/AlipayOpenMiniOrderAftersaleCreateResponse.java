package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.aftersale.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 16:07:33
 */
public class AlipayOpenMiniOrderAftersaleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2838567198438121238L;

	/** 
	 * 平台售后id
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/** 
	 * 外部售后单号
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
