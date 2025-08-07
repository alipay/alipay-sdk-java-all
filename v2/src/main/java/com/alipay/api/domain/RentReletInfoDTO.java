package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单续租信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:42:10
 */
public class RentReletInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7533671176727317757L;

	/**
	 * 原租赁交易组件订单号
	 */
	@ApiField("origin_order_id")
	private String originOrderId;

	public String getOriginOrderId() {
		return this.originOrderId;
	}
	public void setOriginOrderId(String originOrderId) {
		this.originOrderId = originOrderId;
	}

}
