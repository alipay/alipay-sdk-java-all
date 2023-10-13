package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单信息
 *
 * @author auto create
 * @since 1.0, 2018-11-30 11:41:05
 */
public class AntMerchantExpandTradeorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3383613385811175231L;

	/**
	 * 查询结果中是否需要包含指定订单下商品订单，默认false，即不包含指定订单下的商品订单
	 */
	@ApiField("contain_item_order")
	private Boolean containItemOrder;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public Boolean getContainItemOrder() {
		return this.containItemOrder;
	}
	public void setContainItemOrder(Boolean containItemOrder) {
		this.containItemOrder = containItemOrder;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
