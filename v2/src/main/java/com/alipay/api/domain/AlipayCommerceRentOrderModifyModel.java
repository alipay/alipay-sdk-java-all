package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息修改
 *
 * @author auto create
 * @since 1.0, 2025-08-18 20:36:33
 */
public class AlipayCommerceRentOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1663447692298974258L;

	/**
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private RentOrderReceiverAddressInfoDTO addressInfo;

	/**
	 * 默认退货寄回地址
	 */
	@ApiField("default_receiving_address")
	private RentOrderReceiverAddressInfoDTO defaultReceivingAddress;

	/**
	 * 订单履约信息
	 */
	@ApiField("delivery_info")
	private RentOrderDeliveryInfoDTO deliveryInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 租赁分期计划
	 */
	@ApiField("rent_plan_info")
	private OrderModifyRentPlanInfo rentPlanInfo;

	/**
	 * 订单信息的修改类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RentOrderReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RentOrderReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public RentOrderReceiverAddressInfoDTO getDefaultReceivingAddress() {
		return this.defaultReceivingAddress;
	}
	public void setDefaultReceivingAddress(RentOrderReceiverAddressInfoDTO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}

	public RentOrderDeliveryInfoDTO getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(RentOrderDeliveryInfoDTO deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
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

	public OrderModifyRentPlanInfo getRentPlanInfo() {
		return this.rentPlanInfo;
	}
	public void setRentPlanInfo(OrderModifyRentPlanInfo rentPlanInfo) {
		this.rentPlanInfo = rentPlanInfo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
