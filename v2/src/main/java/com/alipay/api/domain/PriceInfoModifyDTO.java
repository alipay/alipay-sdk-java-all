package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格修改信息
 *
 * @author auto create
 * @since 1.0, 2023-08-11 12:14:46
 */
public class PriceInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 4874968565453286479L;

	/**
	 * 订单金额，单位：元
	 */
	@ApiField("order_price")
	private String orderPrice;

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

}
