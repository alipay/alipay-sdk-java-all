package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送订单扩展
 *
 * @author auto create
 * @since 1.0, 2021-03-24 10:05:51
 */
public class OrderExtIstd extends AlipayObject {

	private static final long serialVersionUID = 4325168867992979869L;

	/**
	 * 骑手应付金额
	 */
	@ApiField("cash_on_delivery")
	private String cashOnDelivery;

	/**
	 * 骑手应收金额
	 */
	@ApiField("cash_on_pickup")
	private String cashOnPickup;

	/**
	 * 消费者下单时间
	 */
	@ApiField("consumer_order_time")
	private Date consumerOrderTime;

	/**
	 * 物流流向，1：从门店取件送至用户；2：从用户取件送至门店
	 */
	@ApiField("delivery_direction")
	private Long deliveryDirection;

	/**
	 * 配送类型, 0: 即时单 1 预约单
	 */
	@ApiField("delivery_type")
	private Long deliveryType;

	/**
	 * 备注
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 期望派单时间
	 */
	@ApiField("expected_delivery_time")
	private Date expectedDeliveryTime;

	/**
	 * 期望送达时间
	 */
	@ApiField("expected_finish_time")
	private Date expectedFinishTime;

	/**
	 * 期望取件时间
	 */
	@ApiField("expected_pick_time")
	private Date expectedPickTime;

	/**
	 * 保价金额
	 */
	@ApiField("insure_price")
	private String insurePrice;

	/**
	 * 是否直拿直送，1:直拿直送 0:非直拿直送
	 */
	@ApiField("is_direct_delivery")
	private Long isDirectDelivery;

	/**
	 * 是否需要收货码，1:需要 0:不需要
	 */
	@ApiField("is_finish_code_needed")
	private Long isFinishCodeNeeded;

	/**
	 * 是否保价，1:保价 0:不保价
	 */
	@ApiField("is_insured")
	private Long isInsured;

	/**
	 * 是否需要取货码，1:需要 0:不需要
	 */
	@ApiField("is_pickup_code_needed")
	private Long isPickupCodeNeeded;

	/**
	 * 门店订单流水号
	 */
	@ApiField("poi_seq")
	private String poiSeq;

	/**
	 * 即时配送公司的服务代码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getCashOnDelivery() {
		return this.cashOnDelivery;
	}
	public void setCashOnDelivery(String cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	public String getCashOnPickup() {
		return this.cashOnPickup;
	}
	public void setCashOnPickup(String cashOnPickup) {
		this.cashOnPickup = cashOnPickup;
	}

	public Date getConsumerOrderTime() {
		return this.consumerOrderTime;
	}
	public void setConsumerOrderTime(Date consumerOrderTime) {
		this.consumerOrderTime = consumerOrderTime;
	}

	public Long getDeliveryDirection() {
		return this.deliveryDirection;
	}
	public void setDeliveryDirection(Long deliveryDirection) {
		this.deliveryDirection = deliveryDirection;
	}

	public Long getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(Long deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getExpectedDeliveryTime() {
		return this.expectedDeliveryTime;
	}
	public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	public Date getExpectedFinishTime() {
		return this.expectedFinishTime;
	}
	public void setExpectedFinishTime(Date expectedFinishTime) {
		this.expectedFinishTime = expectedFinishTime;
	}

	public Date getExpectedPickTime() {
		return this.expectedPickTime;
	}
	public void setExpectedPickTime(Date expectedPickTime) {
		this.expectedPickTime = expectedPickTime;
	}

	public String getInsurePrice() {
		return this.insurePrice;
	}
	public void setInsurePrice(String insurePrice) {
		this.insurePrice = insurePrice;
	}

	public Long getIsDirectDelivery() {
		return this.isDirectDelivery;
	}
	public void setIsDirectDelivery(Long isDirectDelivery) {
		this.isDirectDelivery = isDirectDelivery;
	}

	public Long getIsFinishCodeNeeded() {
		return this.isFinishCodeNeeded;
	}
	public void setIsFinishCodeNeeded(Long isFinishCodeNeeded) {
		this.isFinishCodeNeeded = isFinishCodeNeeded;
	}

	public Long getIsInsured() {
		return this.isInsured;
	}
	public void setIsInsured(Long isInsured) {
		this.isInsured = isInsured;
	}

	public Long getIsPickupCodeNeeded() {
		return this.isPickupCodeNeeded;
	}
	public void setIsPickupCodeNeeded(Long isPickupCodeNeeded) {
		this.isPickupCodeNeeded = isPickupCodeNeeded;
	}

	public String getPoiSeq() {
		return this.poiSeq;
	}
	public void setPoiSeq(String poiSeq) {
		this.poiSeq = poiSeq;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
