package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6753663852811342454L;

	/** 
	 * benefitQueryInfo: 权益查询接口返回的具体权益信息
	 */
	@ApiField("benefit_query_info")
	private BenefitQueryInfo benefitQueryInfo;

	public void setBenefitQueryInfo(BenefitQueryInfo benefitQueryInfo) {
		this.benefitQueryInfo = benefitQueryInfo;
	}
	public BenefitQueryInfo getBenefitQueryInfo( ) {
		return this.benefitQueryInfo;
	}

}
