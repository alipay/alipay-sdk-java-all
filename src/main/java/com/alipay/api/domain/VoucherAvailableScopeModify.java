package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-06-07 16:46:26
 */
public class VoucherAvailableScopeModify extends AlipayObject {

	private static final long serialVersionUID = 2543759442183581917L;

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
