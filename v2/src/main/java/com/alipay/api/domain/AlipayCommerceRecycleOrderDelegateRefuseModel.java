package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代用户拒绝回收订单
 *
 * @author auto create
 * @since 1.0, 2025-07-03 10:20:06
 */
public class AlipayCommerceRecycleOrderDelegateRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 2154235126486749328L;

	/**
	 * BRAND:淘宝品牌店铺
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
	 * 描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 请参考回收订单终止原因枚举
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
