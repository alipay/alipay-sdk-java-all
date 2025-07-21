package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手车卖车订单状态同步
 *
 * @author auto create
 * @since 1.0, 2025-06-06 12:00:18
 */
public class AlipayCommerceTransportCarsaleOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2781862846656466324L;

	/**
	 * 原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 交车方式
	 */
	@ApiField("delivery_method")
	private String deliveryMethod;

	/**
	 * 通知状态
	 */
	@ApiField("notice_status")
	private String noticeStatus;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车生活订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * out_order_id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 车商id
	 */
	@ApiField("seller_partner_id")
	private String sellerPartnerId;

	/**
	 * 价格
	 */
	@ApiField("seller_price")
	private String sellerPrice;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getDeliveryMethod() {
		return this.deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getNoticeStatus() {
		return this.noticeStatus;
	}
	public void setNoticeStatus(String noticeStatus) {
		this.noticeStatus = noticeStatus;
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getSellerPartnerId() {
		return this.sellerPartnerId;
	}
	public void setSellerPartnerId(String sellerPartnerId) {
		this.sellerPartnerId = sellerPartnerId;
	}

	public String getSellerPrice() {
		return this.sellerPrice;
	}
	public void setSellerPrice(String sellerPrice) {
		this.sellerPrice = sellerPrice;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
