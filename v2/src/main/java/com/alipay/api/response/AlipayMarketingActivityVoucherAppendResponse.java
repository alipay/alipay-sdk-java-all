package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.append response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-28 18:14:07
 */
public class AlipayMarketingActivityVoucherAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2824788356333198957L;

	/** 
	 * 预充值链接

限制
有效时间3天
	 */
	@ApiField("recharge_url")
	private String rechargeUrl;

	public void setRechargeUrl(String rechargeUrl) {
		this.rechargeUrl = rechargeUrl;
	}
	public String getRechargeUrl( ) {
		return this.rechargeUrl;
	}

}
