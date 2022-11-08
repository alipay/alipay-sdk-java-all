package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2022-08-24 16:06:33
 */
public class OrderVoucherAvailableScopeResult extends AlipayObject {

	private static final long serialVersionUID = 1283625711665353362L;

	/**
	 * 可用门店请求结果。
	 */
	@ApiField("order_voucher_available_shop_result")
	private OrderVoucherAvailableShopResult orderVoucherAvailableShopResult;

	/**
	 * 可用范围类型。
	 */
	@ApiField("voucher_available_type")
	private String voucherAvailableType;

	public OrderVoucherAvailableShopResult getOrderVoucherAvailableShopResult() {
		return this.orderVoucherAvailableShopResult;
	}
	public void setOrderVoucherAvailableShopResult(OrderVoucherAvailableShopResult orderVoucherAvailableShopResult) {
		this.orderVoucherAvailableShopResult = orderVoucherAvailableShopResult;
	}

	public String getVoucherAvailableType() {
		return this.voucherAvailableType;
	}
	public void setVoucherAvailableType(String voucherAvailableType) {
		this.voucherAvailableType = voucherAvailableType;
	}

}
