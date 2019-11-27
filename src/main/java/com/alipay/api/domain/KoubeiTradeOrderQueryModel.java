package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单详情
 *
 * @author auto create
 * @since 1.0, 2018-02-28 17:03:58
 */
public class KoubeiTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6565662691978367233L;

	/**
	 * 示例
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
