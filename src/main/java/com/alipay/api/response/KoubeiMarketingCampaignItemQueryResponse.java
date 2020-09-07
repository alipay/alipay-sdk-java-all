package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 10:32:12
 */
public class KoubeiMarketingCampaignItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8176358824911441291L;

	/** 
	 * 商品详情，包含门店信息
	 */
	@ApiField("item")
	private PromoItemInfo item;

	public void setItem(PromoItemInfo item) {
		this.item = item;
	}
	public PromoItemInfo getItem( ) {
		return this.item;
	}

}
