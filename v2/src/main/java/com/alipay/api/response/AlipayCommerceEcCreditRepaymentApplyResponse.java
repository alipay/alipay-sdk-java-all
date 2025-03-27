package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.repayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 15:27:04
 */
public class AlipayCommerceEcCreditRepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7232582628882249882L;

	/** 
	 * 还款免登链接，资方根据token生成登录态
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
