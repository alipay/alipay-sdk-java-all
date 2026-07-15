package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯支付机构营销券账单查询
 *
 * @author auto create
 * @since 1.0, 2026-04-20 10:22:45
 */
public class AnttechMorseMarketingEquityBilldownloadQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3346126857668653358L;

	/**
	 * 发券活动的活动id，对应要发放的权益红包活动
	 */
	@ApiField("campaign_id")
	private String campaignId;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

}
