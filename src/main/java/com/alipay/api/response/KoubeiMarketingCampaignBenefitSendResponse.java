package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.send response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-10 14:15:00
 */
public class KoubeiMarketingCampaignBenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2418526799735684486L;

	/** 
	 * 领取的权益列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}
	public List<String> getBenefitIds( ) {
		return this.benefitIds;
	}

}
