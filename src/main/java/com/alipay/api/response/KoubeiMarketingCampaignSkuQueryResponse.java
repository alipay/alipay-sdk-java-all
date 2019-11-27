package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.sku.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignSkuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287115171874452241L;

	/** 
	 * 模板适用的sku列表,最多支持800个SKU,超过返回为空
	 */
	@ApiListField("suit_skus")
	@ApiField("string")
	private List<String> suitSkus;

	public void setSuitSkus(List<String> suitSkus) {
		this.suitSkus = suitSkus;
	}
	public List<String> getSuitSkus( ) {
		return this.suitSkus;
	}

}
