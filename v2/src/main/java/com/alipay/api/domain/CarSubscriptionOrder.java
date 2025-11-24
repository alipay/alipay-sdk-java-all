package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2025-11-11 16:17:05
 */
public class CarSubscriptionOrder extends AlipayObject {

	private static final long serialVersionUID = 6326323462429783482L;

	/**
	 * 车辆押金（元）
	 */
	@ApiField("car_deposit")
	private String carDeposit;

	/**
	 * 保险金额（元）
	 */
	@ApiField("insurance_premium")
	private String insurancePremium;

	/**
	 * 大定金额（元）
	 */
	@ApiField("large_deposit_amount")
	private String largeDepositAmount;

	/**
	 * 单位订阅周期租金（元）
	 */
	@ApiField("rental_fee_per_period")
	private String rentalFeePerPeriod;

	/**
	 * 小订金额（元）
	 */
	@ApiField("small_deposit_amount")
	private String smallDepositAmount;

	/**
	 * 订阅周期时长
	 */
	@ApiField("subscription_duration")
	private String subscriptionDuration;

	/**
	 * 订阅周期单位（ChronoUnit）
	 */
	@ApiField("subscription_duration_unit")
	private String subscriptionDurationUnit;

	/**
	 * 订阅里程（km）
	 */
	@ApiField("subscription_mileage")
	private Long subscriptionMileage;

	/**
	 * 违章押金（元）
	 */
	@ApiField("traffic_violation_deposit")
	private String trafficViolationDeposit;

	public String getCarDeposit() {
		return this.carDeposit;
	}
	public void setCarDeposit(String carDeposit) {
		this.carDeposit = carDeposit;
	}

	public String getInsurancePremium() {
		return this.insurancePremium;
	}
	public void setInsurancePremium(String insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	public String getLargeDepositAmount() {
		return this.largeDepositAmount;
	}
	public void setLargeDepositAmount(String largeDepositAmount) {
		this.largeDepositAmount = largeDepositAmount;
	}

	public String getRentalFeePerPeriod() {
		return this.rentalFeePerPeriod;
	}
	public void setRentalFeePerPeriod(String rentalFeePerPeriod) {
		this.rentalFeePerPeriod = rentalFeePerPeriod;
	}

	public String getSmallDepositAmount() {
		return this.smallDepositAmount;
	}
	public void setSmallDepositAmount(String smallDepositAmount) {
		this.smallDepositAmount = smallDepositAmount;
	}

	public String getSubscriptionDuration() {
		return this.subscriptionDuration;
	}
	public void setSubscriptionDuration(String subscriptionDuration) {
		this.subscriptionDuration = subscriptionDuration;
	}

	public String getSubscriptionDurationUnit() {
		return this.subscriptionDurationUnit;
	}
	public void setSubscriptionDurationUnit(String subscriptionDurationUnit) {
		this.subscriptionDurationUnit = subscriptionDurationUnit;
	}

	public Long getSubscriptionMileage() {
		return this.subscriptionMileage;
	}
	public void setSubscriptionMileage(Long subscriptionMileage) {
		this.subscriptionMileage = subscriptionMileage;
	}

	public String getTrafficViolationDeposit() {
		return this.trafficViolationDeposit;
	}
	public void setTrafficViolationDeposit(String trafficViolationDeposit) {
		this.trafficViolationDeposit = trafficViolationDeposit;
	}

}
