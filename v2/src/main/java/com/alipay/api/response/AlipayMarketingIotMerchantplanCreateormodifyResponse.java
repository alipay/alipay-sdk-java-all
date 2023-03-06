package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.iot.merchantplan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:03:04
 */
public class AlipayMarketingIotMerchantplanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7399451221197897299L;

	/** 
	 * 商家活动ID
	 */
	@ApiField("merchant_plan_id")
	private String merchantPlanId;

	public void setMerchantPlanId(String merchantPlanId) {
		this.merchantPlanId = merchantPlanId;
	}
	public String getMerchantPlanId( ) {
		return this.merchantPlanId;
	}

}
