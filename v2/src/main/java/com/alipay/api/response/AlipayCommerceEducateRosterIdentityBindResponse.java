package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.identity.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 17:22:24
 */
public class AlipayCommerceEducateRosterIdentityBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2532734961785298496L;

	/** 
	 * 已绑定的支付宝账号
	 */
	@ApiField("bind_alipay_account")
	private String bindAlipayAccount;

	public void setBindAlipayAccount(String bindAlipayAccount) {
		this.bindAlipayAccount = bindAlipayAccount;
	}
	public String getBindAlipayAccount( ) {
		return this.bindAlipayAccount;
	}

}
