package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格修改信息
 *
 * @author auto create
 * @since 1.0, 2023-12-11 00:04:16
 */
public class PriceInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 2116493744693771385L;

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
