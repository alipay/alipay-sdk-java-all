package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建修改商户进度查询
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3218858444974376163L;

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
