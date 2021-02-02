package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新蓝海活动申请单详情查询
 *
 * @author auto create
 * @since 1.0, 2020-11-26 13:57:39
 */
public class AlipayOpenSpBlueseaactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1594685813246493631L;

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
