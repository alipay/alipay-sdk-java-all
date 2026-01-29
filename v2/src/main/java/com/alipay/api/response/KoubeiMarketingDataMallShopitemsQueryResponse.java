package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TBMiniShopBo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.shopitems.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:04
 */
public class KoubeiMarketingDataMallShopitemsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6479127558179928521L;

	/** 
	 * 店铺信息
	 */
	@ApiListField("shop_list")
	@ApiField("t_b_mini_shop_bo")
	private List<TBMiniShopBo> shopList;

	public void setShopList(List<TBMiniShopBo> shopList) {
		this.shopList = shopList;
	}
	public List<TBMiniShopBo> getShopList( ) {
		return this.shopList;
	}

}
