package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.contract.borrow.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class ZhimaCreditContractBorrowInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3754662919987156632L;

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
