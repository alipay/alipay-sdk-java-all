package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class OrderOpenapi extends AlipayObject {

	private static final long serialVersionUID = 1795168775142961385L;

	/**
	 * 图片url
	 */
	@ApiField("item_image")
	private String itemImage;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 开放平台用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单确认收货时间
	 */
	@ApiField("order_confirm_delivery_time")
	private String orderConfirmDeliveryTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单详情链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单支付金额（元）
	 */
	@ApiField("order_pay_amount")
	private String orderPayAmount;

	/**
	 * 订单支付时间
	 */
	@ApiField("order_pay_time")
	private String orderPayTime;

	/**
	 * 订单退款时间
	 */
	@ApiField("order_refund_time")
	private String orderRefundTime;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemImage() {
		return this.itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderConfirmDeliveryTime() {
		return this.orderConfirmDeliveryTime;
	}
	public void setOrderConfirmDeliveryTime(String orderConfirmDeliveryTime) {
		this.orderConfirmDeliveryTime = orderConfirmDeliveryTime;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderPayAmount() {
		return this.orderPayAmount;
	}
	public void setOrderPayAmount(String orderPayAmount) {
		this.orderPayAmount = orderPayAmount;
	}

	public String getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(String orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrderRefundTime() {
		return this.orderRefundTime;
	}
	public void setOrderRefundTime(String orderRefundTime) {
		this.orderRefundTime = orderRefundTime;
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
