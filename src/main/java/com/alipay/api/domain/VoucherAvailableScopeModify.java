package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:53:27
 */
public class VoucherAvailableScopeModify extends AlipayObject {

	private static final long serialVersionUID = 2486339127492525826L;

	/**
	 * 可用范围修改类型。
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 可用城市修改信息。
	 */
	@ApiField("order_voucher_available_city_code")
	private OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode;

	/**
	 * 可用门店修改信息。
	 */
	@ApiField("order_voucher_available_shop")
	private OrderVoucherAvailableShopModify orderVoucherAvailableShop;

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public OrderVoucherAvailableCityCodeModify getOrderVoucherAvailableCityCode() {
		return this.orderVoucherAvailableCityCode;
	}
	public void setOrderVoucherAvailableCityCode(OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode) {
		this.orderVoucherAvailableCityCode = orderVoucherAvailableCityCode;
	}

	public OrderVoucherAvailableShopModify getOrderVoucherAvailableShop() {
		return this.orderVoucherAvailableShop;
	}
	public void setOrderVoucherAvailableShop(OrderVoucherAvailableShopModify orderVoucherAvailableShop) {
		this.orderVoucherAvailableShop = orderVoucherAvailableShop;
	}

}
