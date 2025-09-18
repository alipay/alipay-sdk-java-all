package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格修改信息
 *
 * @author auto create
 * @since 1.0, 2025-02-19 16:53:06
 */
public class PriceInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 6381897872831957548L;

	/**
	 * 订单金额，单位：元
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 订单的真实金额，适用于下单时不能确定实际金额的场景，单位为元
	 */
	@ApiField("real_order_price")
	private String realOrderPrice;

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getRealOrderPrice() {
		return this.realOrderPrice;
	}
	public void setRealOrderPrice(String realOrderPrice) {
		this.realOrderPrice = realOrderPrice;
	}

}
