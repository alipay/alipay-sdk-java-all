package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品基本信息
 *
 * @author auto create
 * @since 1.0, 2026-10-14 20:19:46
 */
public class LifeServiceOrderBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 4325746497575197986L;

	/**
	 * 商家订单id
	 */
	@ApiField("merchant_order_id")
	private String merchantOrderId;

	/**
	 * 订单下单时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单结束时间
	 */
	@ApiField("order_end_time")
	private Date orderEndTime;

	/**
	 * 订单开始时间
	 */
	@ApiField("order_start_time")
	private Date orderStartTime;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	public String getMerchantOrderId() {
		return this.merchantOrderId;
	}
	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderEndTime() {
		return this.orderEndTime;
	}
	public void setOrderEndTime(Date orderEndTime) {
		this.orderEndTime = orderEndTime;
	}

	public Date getOrderStartTime() {
		return this.orderStartTime;
	}
	public void setOrderStartTime(Date orderStartTime) {
		this.orderStartTime = orderStartTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
