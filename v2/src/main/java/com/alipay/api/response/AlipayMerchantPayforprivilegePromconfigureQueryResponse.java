package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promconfigure.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:49:33
 */
public class AlipayMerchantPayforprivilegePromconfigureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418991784259559436L;

	/** 
	 * 可核销的店铺id列表
	 */
	@ApiListField("enabled_shop_list")
	@ApiField("string")
	private List<String> enabledShopList;

	/** 
	 * 剔除的单品id 列表
	 */
	@ApiListField("exclude_item_ids")
	@ApiField("string")
	private List<String> excludeItemIds;

	/** 
	 * 支持核销的商品id
	 */
	@ApiListField("support_item_ids")
	@ApiField("string")
	private List<String> supportItemIds;

	public void setEnabledShopList(List<String> enabledShopList) {
		this.enabledShopList = enabledShopList;
	}
	public List<String> getEnabledShopList( ) {
		return this.enabledShopList;
	}

	public void setExcludeItemIds(List<String> excludeItemIds) {
		this.excludeItemIds = excludeItemIds;
	}
	public List<String> getExcludeItemIds( ) {
		return this.excludeItemIds;
	}

	public void setSupportItemIds(List<String> supportItemIds) {
		this.supportItemIds = supportItemIds;
	}
	public List<String> getSupportItemIds( ) {
		return this.supportItemIds;
	}

}
