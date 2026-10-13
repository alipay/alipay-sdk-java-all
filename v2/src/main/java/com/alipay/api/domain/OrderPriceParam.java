package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单价格参数（订单原价，门槛基准）
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:42:55
 */
public class OrderPriceParam extends AlipayObject {

	private static final long serialVersionUID = 7728188175212596941L;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private MultiCurrencyMoneyDTO orderAmount;

	/**
	 * 供应商优惠金额
	 */
	@ApiField("supplier_discount")
	private MultiCurrencyMoneyDTO supplierDiscount;

	public MultiCurrencyMoneyDTO getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(MultiCurrencyMoneyDTO orderAmount) {
		this.orderAmount = orderAmount;
	}

	public MultiCurrencyMoneyDTO getSupplierDiscount() {
		return this.supplierDiscount;
	}
	public void setSupplierDiscount(MultiCurrencyMoneyDTO supplierDiscount) {
		this.supplierDiscount = supplierDiscount;
	}

}
