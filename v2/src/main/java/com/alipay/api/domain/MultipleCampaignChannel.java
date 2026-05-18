package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多渠道信息
 *
 * @author auto create
 * @since 1.0, 2026-02-04 18:33:11
 */
public class MultipleCampaignChannel extends AlipayObject {

	private static final long serialVersionUID = 3873577975317557422L;

	/**
	 * 优惠渠道描述优惠来源信息
	 */
	@ApiField("campaign_channel")
	private String campaignChannel;

	/**
	 * 活动渠道码信息，用于标识活动渠道，主要是简称
	 */
	@ApiField("campaign_channel_code")
	private String campaignChannelCode;

	public String getCampaignChannel() {
		return this.campaignChannel;
	}
	public void setCampaignChannel(String campaignChannel) {
		this.campaignChannel = campaignChannel;
	}

	public String getCampaignChannelCode() {
		return this.campaignChannelCode;
	}
	public void setCampaignChannelCode(String campaignChannelCode) {
		this.campaignChannelCode = campaignChannelCode;
	}

}
