package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.instshop.qrcode.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 18:07:31
 */
public class AlipayCommerceRecycleInstshopQrcodeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2781214949567563694L;

	/** 
	 * 支付宝线下门店扫码创单承接页URL
	 */
	@ApiField("alipay_recycle_url")
	private String alipayRecycleUrl;

	public void setAlipayRecycleUrl(String alipayRecycleUrl) {
		this.alipayRecycleUrl = alipayRecycleUrl;
	}
	public String getAlipayRecycleUrl( ) {
		return this.alipayRecycleUrl;
	}

}
