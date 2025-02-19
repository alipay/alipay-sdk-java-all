package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发奖订单的结果信息，用批量发奖结果返回
 *
 * @author auto create
 * @since 1.0, 2023-12-06 17:35:25
 */
public class SendEquityOrderResult extends AlipayObject {

	private static final long serialVersionUID = 8572916942811251584L;

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

	/**
	 * 子订单详细信息列表信息
	 */
	@ApiListField("send_sub_order_result")
	@ApiField("send_sub_order_result")
	private List<SendSubOrderResult> sendSubOrderResult;

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

	public List<SendSubOrderResult> getSendSubOrderResult() {
		return this.sendSubOrderResult;
	}
	public void setSendSubOrderResult(List<SendSubOrderResult> sendSubOrderResult) {
		this.sendSubOrderResult = sendSubOrderResult;
	}

}
