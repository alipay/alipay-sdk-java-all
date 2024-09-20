package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消OpenID转换工单
 *
 * @author auto create
 * @since 1.0, 2023-12-28 11:24:19
 */
public class AlipayOpenAppOpenidApplyorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1886739132953117999L;

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
