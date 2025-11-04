package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单关闭信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:06
 */
public class RecycleSubOrderCloseVO extends AlipayObject {

	private static final long serialVersionUID = 8769182292738551242L;

	/**
	 * 关闭订单的原因描述
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 回收的子订单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 商家的子订单号
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
