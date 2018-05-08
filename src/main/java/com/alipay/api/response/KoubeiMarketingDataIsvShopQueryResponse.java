package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.isv.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-26 09:48:54
 */
public class KoubeiMarketingDataIsvShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795537432824253282L;

	/** 
	 * 门店摘要信息列表
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_info")
	private List<ShopSummaryInfo> shopSummaryInfos;

	public void setShopSummaryInfos(List<ShopSummaryInfo> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}
	public List<ShopSummaryInfo> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

}
