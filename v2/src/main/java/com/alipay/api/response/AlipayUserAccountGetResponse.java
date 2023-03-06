package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 17:48:42
 */
public class AlipayUserAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2514228771172696369L;

	/** 
	 * 支付宝用户账户信息
	 */
	@ApiField("alipay_account")
	private AlipayAccount alipayAccount;

	public void setAlipayAccount(AlipayAccount alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public AlipayAccount getAlipayAccount( ) {
		return this.alipayAccount;
	}

}
