package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品退款确认
 *
 * @author auto create
 * @since 1.0, 2023-08-17 17:06:54
 */
public class AlipayEcoMycarCommercializationRefundConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2857238597335627235L;

	/**
	 * 异步请求编号，异步返回退款确认结果时必传
	 */
	@ApiField("async_request_no")
	private String asyncRequestNo;

	/**
	 * 原因，审批不通过时需要填写
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 审批状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 支付宝侧订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户开放平台id
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getAsyncRequestNo() {
		return this.asyncRequestNo;
	}
	public void setAsyncRequestNo(String asyncRequestNo) {
		this.asyncRequestNo = asyncRequestNo;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
