package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商查询代商家创建智能体记录
 *
 * @author auto create
 * @since 1.0, 2025-05-15 09:56:57
 */
public class AlipayOpenAgentIsvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2851253625633848718L;

	/**
	 * 服务商代商家创建智能体，由支付宝开放平台返回的订单号用于后续查询处理进展。
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
