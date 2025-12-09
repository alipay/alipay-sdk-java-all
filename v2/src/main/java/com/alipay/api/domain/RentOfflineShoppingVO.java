package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下租赁信息
 *
 * @author auto create
 * @since 1.0, 2025-12-05 16:29:41
 */
public class RentOfflineShoppingVO extends AlipayObject {

	private static final long serialVersionUID = 1438321187673588523L;

	/**
	 * 关联租赁订单id
	 */
	@ApiField("relate_rent_order_id")
	private String relateRentOrderId;

	/**
	 * 关联实物购买订单id
	 */
	@ApiField("relate_shopping_order_id")
	private String relateShoppingOrderId;

	public String getRelateRentOrderId() {
		return this.relateRentOrderId;
	}
	public void setRelateRentOrderId(String relateRentOrderId) {
		this.relateRentOrderId = relateRentOrderId;
	}

	public String getRelateShoppingOrderId() {
		return this.relateShoppingOrderId;
	}
	public void setRelateShoppingOrderId(String relateShoppingOrderId) {
		this.relateShoppingOrderId = relateShoppingOrderId;
	}

}
