package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发奖订单的结果信息，用批量发奖结果返回
 *
 * @author auto create
 * @since 1.0, 2023-03-07 14:51:53
 */
public class SendEquityOrderResult extends AlipayObject {

	private static final long serialVersionUID = 4779467487724232599L;

	/**
	 * 权益唯一id标识，摩斯生成的权益id，用于商户端标识权益信息
	 */
	@ApiField("equity_id")
	private String equityId;

	/**
	 * 发奖的权益奖品类型
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * 权益发放的订单唯一id标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 发奖订单的结果码
	 */
	@ApiField("order_result_code")
	private String orderResultCode;

	/**
	 * 发奖订单结果信息
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	/**
	 * 发奖订单的状态信息
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 发奖订单发生时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	public String getEquityId() {
		return this.equityId;
	}
	public void setEquityId(String equityId) {
		this.equityId = equityId;
	}

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderResultCode() {
		return this.orderResultCode;
	}
	public void setOrderResultCode(String orderResultCode) {
		this.orderResultCode = orderResultCode;
	}

	public String getOrderResultMsg() {
		return this.orderResultMsg;
	}
	public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

}
