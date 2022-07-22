package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用门店
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:19:05
 */
public class VoucherAvailableGeographyShopInfo extends AlipayObject {

	private static final long serialVersionUID = 1736157961163351325L;

	/**
	 * 全部门店可用
	 */
	@ApiField("available_geography_all_shop")
	private VoucherAvailableGeographyAllShopInfo availableGeographyAllShop;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。 限制： 1、real_shop_ids中的门店id必须是代运营商业关系门店id。 2、real_shop_ids如果包含重复的门店id会自动进行去重操作。3、shop_ids、real_shop_ids、order_voucher_merchant_all_shop必须三选一
	 */
	@ApiListField("available_real_shop_ids")
	@ApiField("string")
	private List<String> availableRealShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。 限制： 1、shop_ids中的门店id必须是支付宝门店id。 2、shop_ids如果包含重复的门店id会自动进行去重操作。 3、shop_ids、real_shop_ids、order_voucher_merchant_all_shop必须三选一
	 */
	@ApiListField("available_shop_ids")
	@ApiField("string")
	private List<String> availableShopIds;

	public VoucherAvailableGeographyAllShopInfo getAvailableGeographyAllShop() {
		return this.availableGeographyAllShop;
	}
	public void setAvailableGeographyAllShop(VoucherAvailableGeographyAllShopInfo availableGeographyAllShop) {
		this.availableGeographyAllShop = availableGeographyAllShop;
	}

	public List<String> getAvailableRealShopIds() {
		return this.availableRealShopIds;
	}
	public void setAvailableRealShopIds(List<String> availableRealShopIds) {
		this.availableRealShopIds = availableRealShopIds;
	}

	public List<String> getAvailableShopIds() {
		return this.availableShopIds;
	}
	public void setAvailableShopIds(List<String> availableShopIds) {
		this.availableShopIds = availableShopIds;
	}

}
