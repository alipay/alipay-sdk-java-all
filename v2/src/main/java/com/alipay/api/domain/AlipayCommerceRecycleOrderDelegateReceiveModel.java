package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代用户确认收货回收订单
 *
 * @author auto create
 * @since 1.0, 2025-07-03 10:20:05
 */
public class AlipayCommerceRecycleOrderDelegateReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2311752337837619161L;

	/**
	 * 淘宝品牌店铺：BRAND
	 */
	@ApiField("delegate_type")
	private String delegateType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易订单号
	 */
	@ApiField("order_id")
	private String orderId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
