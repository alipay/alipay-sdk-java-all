package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下即时配送订单时返回的运单信息列表
 *
 * @author auto create
 * @since 1.0, 2020-11-18 10:12:08
 */
public class PreCreateWaybillIstd extends AlipayObject {

	private static final long serialVersionUID = 8185367756685567644L;

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
	 * 预计骑手还剩多久接单（单位：秒）
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
	 * 保价费用
	 */
	@ApiField("insurance_fee")
	private String insuranceFee;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 配送公司可以返回此字段，当商家下单时候带上这个字段，保证在一段时间内运费不变
	 */
	@ApiField("logistics_token")
	private String logisticsToken;

	/**
	 * 支付金额，实际扣减的费用以此字段为准
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 即时配送公司服务代码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 即时配送公司返回的响应码。10000表示业务处理成功，40004表示业务处理失败。
	 */
	@ApiField("third_code")
	private String thirdCode;

	/**
	 * 即时配送公司返回的错误码
	 */
	@ApiField("third_sub_code")
	private String thirdSubCode;

	/**
	 * 即时配送公司返回的错误描述
	 */
	@ApiField("third_sub_msg")
	private String thirdSubMsg;

	public String getCouponFee() {
		return this.couponFee;
	}
	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}

	public String getDeliverFee() {
		return this.deliverFee;
	}
	public void setDeliverFee(String deliverFee) {
		this.deliverFee = deliverFee;
	}

	public Long getDispatchDuration() {
		return this.dispatchDuration;
	}
	public void setDispatchDuration(Long dispatchDuration) {
		this.dispatchDuration = dispatchDuration;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getInsuranceFee() {
		return this.insuranceFee;
	}
	public void setInsuranceFee(String insuranceFee) {
		this.insuranceFee = insuranceFee;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsToken() {
		return this.logisticsToken;
	}
	public void setLogisticsToken(String logisticsToken) {
		this.logisticsToken = logisticsToken;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getThirdCode() {
		return this.thirdCode;
	}
	public void setThirdCode(String thirdCode) {
		this.thirdCode = thirdCode;
	}

	public String getThirdSubCode() {
		return this.thirdSubCode;
	}
	public void setThirdSubCode(String thirdSubCode) {
		this.thirdSubCode = thirdSubCode;
	}

	public String getThirdSubMsg() {
		return this.thirdSubMsg;
	}
	public void setThirdSubMsg(String thirdSubMsg) {
		this.thirdSubMsg = thirdSubMsg;
	}

}
