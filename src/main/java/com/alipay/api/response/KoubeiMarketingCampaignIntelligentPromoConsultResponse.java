package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-23 18:30:42
 */
public class KoubeiMarketingCampaignIntelligentPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154952211221346546L;

	/** 
	 * 智能营销方案咨询的模型
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
