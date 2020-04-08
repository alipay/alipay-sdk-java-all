package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-19 12:04:14
 */
public class AlipayMarketingCdpAdvertiseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7798492741956675344L;

	/** 
	 * 创建广告唯一标识
	 */
	@ApiField("ad_id")
	private String adId;

	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdId( ) {
		return this.adId;
	}

}
