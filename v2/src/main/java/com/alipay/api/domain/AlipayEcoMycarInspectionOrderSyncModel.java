package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝年检订单回流
 *
 * @author auto create
 * @since 1.0, 2026-04-03 17:08:40
 */
public class AlipayEcoMycarInspectionOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3318965752345787958L;

	/**
	 * 下单时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 订单优惠金额，单位：分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额，单位分
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 滴滴年检订单号，长度不超过64位
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单实付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * SKU名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
