package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品交易查询接口
 *
 * @author auto create
 * @since 1.0, 2020-11-10 10:08:10
 */
public class KoubeiTradeItemorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1653143168153132511L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
