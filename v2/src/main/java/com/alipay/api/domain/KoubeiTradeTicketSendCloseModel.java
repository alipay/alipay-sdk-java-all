package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放单关闭
 *
 * @author auto create
 * @since 1.0, 2019-11-19 14:48:37
 */
public class KoubeiTradeTicketSendCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3163774898183585674L;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 停止发码原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 外部请求流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑商品发货单号
	 */
	@ApiField("send_order_no")
	private String sendOrderNo;

	/**
	 * 凭证发放token
	 */
	@ApiField("send_token")
	private String sendToken;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSendOrderNo() {
		return this.sendOrderNo;
	}
	public void setSendOrderNo(String sendOrderNo) {
		this.sendOrderNo = sendOrderNo;
	}

	public String getSendToken() {
		return this.sendToken;
	}
	public void setSendToken(String sendToken) {
		this.sendToken = sendToken;
	}

}
