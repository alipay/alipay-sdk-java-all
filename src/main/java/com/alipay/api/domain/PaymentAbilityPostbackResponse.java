package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力回传结果信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PaymentAbilityPostbackResponse extends AlipayObject {

	private static final long serialVersionUID = 4452924336943618956L;

	/**
	 * 错误的订单信息
	 */
	@ApiField("error_order")
	private String errorOrder;

	/**
	 * 成功的订单列表,逗号分隔
	 */
	@ApiField("order_ids")
	private String orderIds;

	public String getErrorOrder() {
		return this.errorOrder;
	}
	public void setErrorOrder(String errorOrder) {
		this.errorOrder = errorOrder;
	}

	public String getOrderIds() {
		return this.orderIds;
	}
	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

}
