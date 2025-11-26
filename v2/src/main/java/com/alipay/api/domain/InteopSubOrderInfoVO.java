package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业子单信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 17:07:21
 */
public class InteopSubOrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5257795968347891558L;

	/**
	 * 用于记录子单的原因信息
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 一体化作业子单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 一体化作业子单桩体啊
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 一体化作业子单类型
	 */
	@ApiField("type")
	private String type;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
