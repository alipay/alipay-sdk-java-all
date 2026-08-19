package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询代创建SKILL结果
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:37:51
 */
public class AlipayOpenSpSkillCreateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7621211165484222784L;

	/**
	 * 申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
