package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单更新接口
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:50
 */
public class AlipayEcoMycarParkingOrderUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1892894236726858165L;

	/**
	 * 应用用户ID，唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝支付流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 用户停车订单状态，枚举支持：
*0：成功。
*1：失败。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
注意：ISV需保证用户 id 的正确性，以免导致用户在停车平台查询不到相关的订单信息。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
