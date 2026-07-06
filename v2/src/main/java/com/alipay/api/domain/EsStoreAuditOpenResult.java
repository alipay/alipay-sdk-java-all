package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询店铺信息
 *
 * @author auto create
 * @since 1.0, 2026-06-26 21:16:16
 */
public class EsStoreAuditOpenResult extends AlipayObject {

	private static final long serialVersionUID = 4287628556738259751L;

	/**
	 * 直付通申请单ID(标准进件返回)
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 直付通进件申请单订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型：SETTLE_CREATE 创建结算信息
SETTLE_MODIFY 修改结算信息
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 拒绝原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 直付通审核状态
	 */
	@ApiField("status")
	private String status;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
