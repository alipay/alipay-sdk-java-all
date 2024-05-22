package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopCategoryConfigInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:56:53
 */
public class AlipayOfflineMarketShopCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1323735143838943199L;

	/** 
	 * 门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。
	 */
	@ApiListField("shop_category_config_infos")
	@ApiField("shop_category_config_info")
	private List<ShopCategoryConfigInfo> shopCategoryConfigInfos;

	public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
		this.shopCategoryConfigInfos = shopCategoryConfigInfos;
	}
	public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos( ) {
		return this.shopCategoryConfigInfos;
	}

}
