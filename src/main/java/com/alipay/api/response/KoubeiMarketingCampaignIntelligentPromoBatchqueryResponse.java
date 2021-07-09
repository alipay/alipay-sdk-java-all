package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntelligentPromo;
import com.alipay.api.domain.PromoPageResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3356552558496592311L;

	/** 
	 * 查询返回的营销活动列表信息
	 */
	@ApiListField("intelligent_promos")
	@ApiField("intelligent_promo")
	private List<IntelligentPromo> intelligentPromos;

	/** 
	 * 查询后返回的分页信息
	 */
	@ApiField("page_result")
	private PromoPageResult pageResult;

	public void setIntelligentPromos(List<IntelligentPromo> intelligentPromos) {
		this.intelligentPromos = intelligentPromos;
	}
	public List<IntelligentPromo> getIntelligentPromos( ) {
		return this.intelligentPromos;
	}

	public void setPageResult(PromoPageResult pageResult) {
		this.pageResult = pageResult;
	}
	public PromoPageResult getPageResult( ) {
		return this.pageResult;
	}

}
