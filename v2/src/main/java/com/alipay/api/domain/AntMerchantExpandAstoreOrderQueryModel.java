package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺申请单进度查询
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:27:01
 */
public class AntMerchantExpandAstoreOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7745185625779488521L;

	/**
	 * 申请单id
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
