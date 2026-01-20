package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非标汽车售卖模式订单信息
 *
 * @author auto create
 * @since 1.0, 2025-12-17 11:05:19
 */
public class CarSubscriptionOrder extends AlipayObject {

	private static final long serialVersionUID = 2438317245318428121L;

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
	 * 单位订阅周期租金的组成部分：基础费（元）
	 */
	@ApiField("rental_fee_per_period_of_basic")
	private String rentalFeePerPeriodOfBasic;

	/**
	 * 单位订阅周期租金的组成部分：保险费（元）
	 */
	@ApiField("rental_fee_per_period_of_insurance")
	private String rentalFeePerPeriodOfInsurance;

	/**
	 * 单位订阅周期租金的组成部分：里程费（元）
	 */
	@ApiField("rental_fee_per_period_of_mileage")
	private String rentalFeePerPeriodOfMileage;

	/**
	 * 单位订阅周期租金的组成部分：指标费（元）
	 */
	@ApiField("rental_fee_per_period_of_quota")
	private String rentalFeePerPeriodOfQuota;

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

	public String getRentalFeePerPeriodOfBasic() {
		return this.rentalFeePerPeriodOfBasic;
	}
	public void setRentalFeePerPeriodOfBasic(String rentalFeePerPeriodOfBasic) {
		this.rentalFeePerPeriodOfBasic = rentalFeePerPeriodOfBasic;
	}

	public String getRentalFeePerPeriodOfInsurance() {
		return this.rentalFeePerPeriodOfInsurance;
	}
	public void setRentalFeePerPeriodOfInsurance(String rentalFeePerPeriodOfInsurance) {
		this.rentalFeePerPeriodOfInsurance = rentalFeePerPeriodOfInsurance;
	}

	public String getRentalFeePerPeriodOfMileage() {
		return this.rentalFeePerPeriodOfMileage;
	}
	public void setRentalFeePerPeriodOfMileage(String rentalFeePerPeriodOfMileage) {
		this.rentalFeePerPeriodOfMileage = rentalFeePerPeriodOfMileage;
	}

	public String getRentalFeePerPeriodOfQuota() {
		return this.rentalFeePerPeriodOfQuota;
	}
	public void setRentalFeePerPeriodOfQuota(String rentalFeePerPeriodOfQuota) {
		this.rentalFeePerPeriodOfQuota = rentalFeePerPeriodOfQuota;
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
