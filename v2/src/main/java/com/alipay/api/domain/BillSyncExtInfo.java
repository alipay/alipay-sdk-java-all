package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单同步的扩展字段信息
 *
 * @author auto create
 * @since 1.0, 2021-08-17 14:59:15
 */
public class BillSyncExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3521559884338575739L;

	/**
	 * 账单类型
	 */
	@ApiField("order_pay_type")
	private String orderPayType;

	public String getOrderPayType() {
		return this.orderPayType;
	}
	public void setOrderPayType(String orderPayType) {
		this.orderPayType = orderPayType;
	}

}
