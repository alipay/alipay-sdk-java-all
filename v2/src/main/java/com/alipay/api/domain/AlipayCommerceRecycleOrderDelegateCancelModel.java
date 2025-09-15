package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代用户取消回收订单
 *
 * @author auto create
 * @since 1.0, 2025-07-03 12:02:35
 */
public class AlipayCommerceRecycleOrderDelegateCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3535644834366567376L;

	/**
	 * 代用户取消订单，代理方角色类型：BRAND：品牌方
	 */
	@ApiField("delegate_type")
	private String delegateType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 取消订单的原因描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 拒绝原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDelegateType() {
		return this.delegateType;
	}
	public void setDelegateType(String delegateType) {
		this.delegateType = delegateType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
