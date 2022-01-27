package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-19 14:53:43
 */
public class KoubeiMarketingCampaignIntelligentPromoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1834466521542683773L;

	/** 
	 * 智能营销活动信息
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
