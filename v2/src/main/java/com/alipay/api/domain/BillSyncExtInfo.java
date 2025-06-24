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

	private static final long serialVersionUID = 8232562875818777651L;

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
