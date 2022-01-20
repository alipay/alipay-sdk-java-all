package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.istdretry.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:05
 */
public class AlipayCommerceLogisticsOrderIstdretryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2154816718671748299L;

	/** 
	 * 优惠券费用
	 */
	@ApiField("coupon_fee")
	private String couponFee;

	/** 
	 * 运费
	 */
	@ApiField("deliver_fee")
	private String deliverFee;

	/** 
	 * 预计骑手还剩多久接单，单位：秒
	 */
	@ApiField("dispatch_duration")
	private Long dispatchDuration;

	/** 
	 * 配送距离(单位：米)
	 */
	@ApiField("distance")
	private Long distance;

	/** 
	 * 实际运费
	 */
	@ApiField("fee")
	private String fee;

	/** 
	 * 收货码，骑手必须输入收货码才能完成订单妥投
	 */
	@ApiField("finish_code")
	private String finishCode;

	/** 
	 * 保价费用
	 */
	@ApiField("insurance_fee")
	private String insuranceFee;

	/** 
	 * 支付宝订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额, 实际扣减的费用以此字段为准
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 取货码, 骑手必须输入取货码才能从商家取货
	 */
	@ApiField("pickup_code")
	private String pickupCode;

	/** 
	 * 即时配送运单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}
	public String getCouponFee( ) {
		return this.couponFee;
	}

	public void setDeliverFee(String deliverFee) {
		this.deliverFee = deliverFee;
	}
	public String getDeliverFee( ) {
		return this.deliverFee;
	}

	public void setDispatchDuration(Long dispatchDuration) {
		this.dispatchDuration = dispatchDuration;
	}
	public Long getDispatchDuration( ) {
		return this.dispatchDuration;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public Long getDistance( ) {
		return this.distance;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getFee( ) {
		return this.fee;
	}

	public void setFinishCode(String finishCode) {
		this.finishCode = finishCode;
	}
	public String getFinishCode( ) {
		return this.finishCode;
	}

	public void setInsuranceFee(String insuranceFee) {
		this.insuranceFee = insuranceFee;
	}
	public String getInsuranceFee( ) {
		return this.insuranceFee;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPickupCode(String pickupCode) {
		this.pickupCode = pickupCode;
	}
	public String getPickupCode( ) {
		return this.pickupCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}
	public String getWaybillNo( ) {
		return this.waybillNo;
	}

}
