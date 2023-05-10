package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:13:00
 */
public class KoubeiMarketingAdvertisingModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2758529425294322145L;

	/** 
	 * 正常操作返回当前操作的广告id。如果操作失败，返回的广告id为空
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
