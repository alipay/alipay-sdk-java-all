package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-06-10 16:34:20
 */
public class VoucherAvailableScopeModify extends AlipayObject {

	private static final long serialVersionUID = 3542457599193397827L;

	/**
	 * 可用范围修改类型。
ADD:增加可用范围
REMOVE:减少可用范围
MODIFY_ALL:修改全量可用范围
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 可用城市修改信息。
注意:
与modify_type结合使用,modify_type=ADD时只需传入需要增加的城市
	 */
	@ApiField("order_voucher_available_city_code")
	private OrderVoucherAvailableCityCodeModify orderVoucherAvailableCityCode;

	/**
	 * 可用门店修改信息。
注意:
1.与modify_type结合使用,modify_type=ADD时只需传入需要增加的门店。
2.门店修改支持部分成功，商户可根据返回结果调整失败的门店信息，调整后再修改。
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
