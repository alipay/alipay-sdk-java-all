package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店可用
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:19:05
 */
public class VoucherAvailableGeographyAllShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6228636555726666724L;

	/**
	 * 券不可使用的门店列表。指定商户全部门店可用时可通过该字段排除部分不可用门店。 列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。 限制： 1、exclude_shop_ids中的门店id必须是支付宝门店id。 2、exclude_shop_ids如果包含重复的门店id会自动进行去重操作。
	 */
	@ApiListField("exclude_shop_ids")
	@ApiField("string")
	private List<String> excludeShopIds;

	/**
	 * 全部门店可用的商户ID

限制:
1.目前只支持传当前活动归属的商户ID
2.目前只支持传入单个商户ID
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
