package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.trusteeship.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-16 10:01:49
 */
public class AlipayFundTransTrusteeshipAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3457528162599458321L;

	/** 
	 * 开设的支付宝账号user_id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
