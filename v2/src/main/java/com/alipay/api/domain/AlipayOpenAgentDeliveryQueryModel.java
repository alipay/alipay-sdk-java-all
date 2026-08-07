package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询投放记录
 *
 * @author auto create
 * @since 1.0, 2026-08-05 20:48:23
 */
public class AlipayOpenAgentDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7122353682588384114L;

	/**
	 * alipay.open.agent.delivery.submit返回的投放记录ID
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

}
