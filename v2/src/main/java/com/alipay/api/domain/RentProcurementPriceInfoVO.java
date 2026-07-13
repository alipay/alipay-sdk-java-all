package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金额信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class RentProcurementPriceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2874437221899741331L;

	/**
	 * 订单金额，单位：元，精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * null
	 */
	@ApiListField("pay_items")
	@ApiField("rent_procurement_pay_item_info_v_o")
	private List<RentProcurementPayItemInfoVO> payItems;

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public List<RentProcurementPayItemInfoVO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<RentProcurementPayItemInfoVO> payItems) {
		this.payItems = payItems;
	}

}
