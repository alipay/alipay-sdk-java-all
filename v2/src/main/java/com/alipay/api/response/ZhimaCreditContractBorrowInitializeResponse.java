package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.contract.borrow.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 13:57:34
 */
public class ZhimaCreditContractBorrowInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8599658249966415262L;

	/** 
	 * url：mode=0(二维码主扫模式)下，返回的url，在借还的机具上渲染为二维码后，用户使用支付宝扫一扫唤起该页面
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
