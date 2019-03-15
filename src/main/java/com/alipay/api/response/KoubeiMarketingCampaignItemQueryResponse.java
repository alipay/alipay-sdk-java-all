package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6811292756671392239L;

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
