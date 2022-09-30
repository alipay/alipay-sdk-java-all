package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 20:50:56
 */
public class AlipayMarketingActivityVoucherPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7853328541377286515L;

	/** 
	 * 预充值链接

限制:
链接有效时间3天
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
