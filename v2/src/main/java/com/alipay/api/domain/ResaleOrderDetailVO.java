package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2026-05-26 16:42:49
 */
public class ResaleOrderDetailVO extends AlipayObject {

	private static final long serialVersionUID = 6736442588969311839L;

	/**
	 * 履约信息
	 */
	@ApiField("delivery_info")
	private ResaleDeliveryInfoVO deliveryInfo;

	/**
	 * 商品信息集合
	 */
	@ApiField("item_info_list")
	private ResaleOrderItemVO itemInfoList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额，元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 使用超链接格式展示链接。
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 二手售卖订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单备注
	 */
	@ApiField("order_memo")
	private String orderMemo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("ppi_order_id")
	private String ppiOrderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public ResaleDeliveryInfoVO getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(ResaleDeliveryInfoVO deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public ResaleOrderItemVO getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(ResaleOrderItemVO itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderMemo() {
		return this.orderMemo;
	}
	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPpiOrderId() {
		return this.ppiOrderId;
	}
	public void setPpiOrderId(String ppiOrderId) {
		this.ppiOrderId = ppiOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
