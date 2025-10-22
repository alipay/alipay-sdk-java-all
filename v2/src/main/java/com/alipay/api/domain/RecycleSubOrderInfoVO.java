package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:11
 */
public class RecycleSubOrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1183921315552736637L;

	/**
	 * 回收子单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 回收的订单状态
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 商家的子单号
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
