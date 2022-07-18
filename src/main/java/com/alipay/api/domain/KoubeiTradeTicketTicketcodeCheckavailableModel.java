package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查凭证是否可用
 *
 * @author auto create
 * @since 1.0, 2019-11-19 14:55:09
 */
public class KoubeiTradeTicketTicketcodeCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 8612945111587241687L;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 核销次数(次卡场景使用，要求大于0)，非次卡建议填充1或者不填
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑商品发货单号
	 */
	@ApiField("send_order_no")
	private String sendOrderNo;

	/**
	 * 发货token
	 */
	@ApiField("send_token")
	private String sendToken;

	/**
	 * 核销门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部凭证码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
