package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.tag.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-20 14:00:14
 */
public class AlipayMarketingCampaignRuleTagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2581217655634877682L;

	/** 
	 * 自定义标签id（创建自定义规则时提供）
	 */
	@ApiField("customertag")
	private String customertag;

	public void setCustomertag(String customertag) {
		this.customertag = customertag;
	}
	public String getCustomertag( ) {
		return this.customertag;
	}

}
