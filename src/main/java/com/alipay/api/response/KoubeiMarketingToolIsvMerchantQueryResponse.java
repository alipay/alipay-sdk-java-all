package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvMerchantInfo;
import com.alipay.api.domain.ShopSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.isv.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingToolIsvMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2452923482475677651L;

	/** 
	 * 商户信息列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("isv_merchant_info")
	private List<IsvMerchantInfo> merchantInfos;

	/** 
	 * 门店总量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/** 
	 * 门店详情列表信息
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_info")
	private List<ShopSummaryInfo> shopSummaryInfos;

	public void setMerchantInfos(List<IsvMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}
	public List<IsvMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
	}

	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}
	public String getShopCount( ) {
		return this.shopCount;
	}

	public void setShopSummaryInfos(List<ShopSummaryInfo> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}
	public List<ShopSummaryInfo> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

}
