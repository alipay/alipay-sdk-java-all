package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预缴费订单查询
 *
 * @author auto create
 * @since 1.0, 2024-04-15 10:54:04
 */
public class AlipayOverseasOpenPreorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6838992514953155694L;

	/**
	 * 预缴费单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
