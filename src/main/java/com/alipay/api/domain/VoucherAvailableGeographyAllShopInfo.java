package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店可用
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherAvailableGeographyAllShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6844485786188756382L;

	/**
	 * 券不可使用的门店列表。指定商户全部门店可用时可通过该字段排除部分不可用门店。 列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。
	 */
	@ApiListField("exclude_shop_ids")
	@ApiField("string")
	private List<String> excludeShopIds;

	/**
	 * 全部门店可用的商户ID
	 */
	@ApiListField("merchant_ids")
	@ApiField("string")
	private List<String> merchantIds;

	public List<String> getExcludeShopIds() {
		return this.excludeShopIds;
	}
	public void setExcludeShopIds(List<String> excludeShopIds) {
		this.excludeShopIds = excludeShopIds;
	}

	public List<String> getMerchantIds() {
		return this.merchantIds;
	}
	public void setMerchantIds(List<String> merchantIds) {
		this.merchantIds = merchantIds;
	}

}
