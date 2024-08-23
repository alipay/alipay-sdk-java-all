package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntelligentPromoShopSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.shop.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:56
 */
public class KoubeiMarketingCampaignIntelligentShopConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6758971249762454394L;

	/** 
	 * 总共项数
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 智能营销方案符合标准的门店列表
	 */
	@ApiListField("shops")
	@ApiField("intelligent_promo_shop_summary_info")
	private List<IntelligentPromoShopSummaryInfo> shops;

	public void setItems(String items) {
		this.items = items;
	}
	public String getItems( ) {
		return this.items;
	}

	public void setShops(List<IntelligentPromoShopSummaryInfo> shops) {
		this.shops = shops;
	}
	public List<IntelligentPromoShopSummaryInfo> getShops( ) {
		return this.shops;
	}

}
