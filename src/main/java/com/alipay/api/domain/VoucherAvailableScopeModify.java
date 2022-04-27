package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-04-08 21:46:32
 */
public class VoucherAvailableScopeModify extends AlipayObject {

	private static final long serialVersionUID = 4241383831454717439L;

	/**
	 * 可用门店修改信息
	 */
	@ApiField("order_voucher_available_shop")
	private OrderVoucherAvailableShopModify orderVoucherAvailableShop;

	public OrderVoucherAvailableShopModify getOrderVoucherAvailableShop() {
		return this.orderVoucherAvailableShop;
	}
	public void setOrderVoucherAvailableShop(OrderVoucherAvailableShopModify orderVoucherAvailableShop) {
		this.orderVoucherAvailableShop = orderVoucherAvailableShop;
	}

}
