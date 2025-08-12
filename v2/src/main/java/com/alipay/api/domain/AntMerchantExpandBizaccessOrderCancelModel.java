package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通进度主动撤销
 *
 * @author auto create
 * @since 1.0, 2025-04-16 17:22:26
 */
public class AntMerchantExpandBizaccessOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4659463449369396654L;

	/**
	 * 主单id	
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
