package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.repayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-22 14:26:45
 */
public class AlipayCommerceEcCreditRepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2723874114218956165L;

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
