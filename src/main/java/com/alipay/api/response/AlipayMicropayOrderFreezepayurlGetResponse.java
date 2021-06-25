package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.freezepayurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMicropayOrderFreezepayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2228335266899938887L;

	/** 
	 * 支付冻结金的地址
	 */
	@ApiField("pay_freeze_url")
	private String payFreezeUrl;

	public void setPayFreezeUrl(String payFreezeUrl) {
		this.payFreezeUrl = payFreezeUrl;
	}
	public String getPayFreezeUrl( ) {
		return this.payFreezeUrl;
	}

}
