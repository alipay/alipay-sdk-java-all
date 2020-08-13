package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单更新接口
 *
 * @author auto create
 * @since 1.0, 2020-07-29 09:38:31
 */
public class AlipayEcoMycarParkingOrderUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2744666455342244648L;

	/**
	 * 支付宝支付流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 用户停车订单状态，0：成功，1：失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 停车缴费支付宝用户的ID，请ISV保证用户ID的正确性，以免导致用户在停车平台查询不到相关的订单信息
	 */
	@ApiField("user_id")
	private String userId;

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
