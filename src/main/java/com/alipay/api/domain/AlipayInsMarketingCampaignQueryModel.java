package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据活动id查询活动信息
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:25
 */
public class AlipayInsMarketingCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4343649659156616566L;

	/**
	 * 保险营销活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
