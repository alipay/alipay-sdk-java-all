package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家券可用门店信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:31:44
 */
public class OrderVoucherAvailableShop extends AlipayObject {

	private static final long serialVersionUID = 2441652976519647323L;

	/**
	 * 商户全部门店可用。
	 */
	@ApiField("order_voucher_merchant_all_shop")
	private OrderVoucherMerchantAllShop orderVoucherMerchantAllShop;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。
	 */
	@ApiListField("real_shop_ids")
	@ApiField("string")
	private List<String> realShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public OrderVoucherMerchantAllShop getOrderVoucherMerchantAllShop() {
		return this.orderVoucherMerchantAllShop;
	}
	public void setOrderVoucherMerchantAllShop(OrderVoucherMerchantAllShop orderVoucherMerchantAllShop) {
		this.orderVoucherMerchantAllShop = orderVoucherMerchantAllShop;
	}

	public List<String> getRealShopIds() {
		return this.realShopIds;
	}
	public void setRealShopIds(List<String> realShopIds) {
		this.realShopIds = realShopIds;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
