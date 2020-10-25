package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新蓝海活动申请单详情查询
 *
 * @author auto create
 * @since 1.0, 2020-10-24 07:17:10
 */
public class AlipayOpenSpBlueseaactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3545323517173148822L;

	/**
	 * 申请单Id
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
