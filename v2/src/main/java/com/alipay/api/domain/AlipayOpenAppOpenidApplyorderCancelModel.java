package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消OpenID转换工单
 *
 * @author auto create
 * @since 1.0, 2023-04-07 10:13:50
 */
public class AlipayOpenAppOpenidApplyorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6187473117242586413L;

	/**
	 * 工单唯一标识
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
