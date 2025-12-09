package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单物流信息
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:20
 */
public class AlipayCloudCloudpromoMallLogisticsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1247426123216534651L;

	/**
	 * 订单号
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
