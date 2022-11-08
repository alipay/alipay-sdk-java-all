package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用门店处理结果
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:55:35
 */
public class OrderVoucherAvailableShopResult extends AlipayObject {

	private static final long serialVersionUID = 3192116842225115396L;

	/**
	 * 商户全部门店可用请求结果。
	 */
	@ApiField("order_voucher_merchant_all_shop_result")
	private OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult;

	/**
	 * 请求失败的代运营商业关系门店详情
	 */
	@ApiListField("real_shop_fail_infos")
	@ApiField("order_voucher_real_shop_fail_info")
	private List<OrderVoucherRealShopFailInfo> realShopFailInfos;

	/**
	 * 请求失败的支付宝门店详情。
	 */
	@ApiListField("shop_fail_infos")
	@ApiField("order_voucher_shop_fail_info")
	private List<OrderVoucherShopFailInfo> shopFailInfos;

	/**
	 * 请求成功的代运营商业关系门店
	 */
	@ApiListField("success_real_shop_ids")
	@ApiField("string")
	private List<String> successRealShopIds;

	/**
	 * 请求成功的支付宝门店。
	 */
	@ApiListField("success_shop_ids")
	@ApiField("string")
	private List<String> successShopIds;

	public OrderVoucherMerchantAllShopResult getOrderVoucherMerchantAllShopResult() {
		return this.orderVoucherMerchantAllShopResult;
	}
	public void setOrderVoucherMerchantAllShopResult(OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult) {
		this.orderVoucherMerchantAllShopResult = orderVoucherMerchantAllShopResult;
	}

	public List<OrderVoucherRealShopFailInfo> getRealShopFailInfos() {
		return this.realShopFailInfos;
	}
	public void setRealShopFailInfos(List<OrderVoucherRealShopFailInfo> realShopFailInfos) {
		this.realShopFailInfos = realShopFailInfos;
	}

	public List<OrderVoucherShopFailInfo> getShopFailInfos() {
		return this.shopFailInfos;
	}
	public void setShopFailInfos(List<OrderVoucherShopFailInfo> shopFailInfos) {
		this.shopFailInfos = shopFailInfos;
	}

	public List<String> getSuccessRealShopIds() {
		return this.successRealShopIds;
	}
	public void setSuccessRealShopIds(List<String> successRealShopIds) {
		this.successRealShopIds = successRealShopIds;
	}

	public List<String> getSuccessShopIds() {
		return this.successShopIds;
	}
	public void setSuccessShopIds(List<String> successShopIds) {
		this.successShopIds = successShopIds;
	}

}
