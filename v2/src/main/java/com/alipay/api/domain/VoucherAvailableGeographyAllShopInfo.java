package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店可用
 *
 * @author auto create
 * @since 1.0, 2025-06-19 14:04:30
 */
public class VoucherAvailableGeographyAllShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8629989531278819435L;

	/**
	 * 全部门店可用的品牌ID
提示:
1.目前只支持传入当前券归属商户的品牌ID
2.品牌ID可以在登录b.alipay.com-账户中心-品牌管理里查看。如果没有品牌，可以先创建品牌。Sop：
注意事项
1.只支持传入单个品牌ID
2.传入品牌ID后，券的商户品牌和logo仍以voucher_display_pattern_info传入为准。
	 */
	@ApiField("available_brand_id")
	private String availableBrandId;

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

	public String getAvailableBrandId() {
		return this.availableBrandId;
	}
	public void setAvailableBrandId(String availableBrandId) {
		this.availableBrandId = availableBrandId;
	}

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
