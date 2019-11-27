package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.user.usercreditdigest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditUserUsercreditdigestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6756243128157129426L;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant")
	private String merchant;

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getMerchant( ) {
		return this.merchant;
	}

}
