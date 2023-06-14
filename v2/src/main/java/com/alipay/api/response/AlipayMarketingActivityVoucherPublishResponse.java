package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 13:41:50
 */
public class AlipayMarketingActivityVoucherPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8178927249114116466L;

	/** 
	 * 预充值链接
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
