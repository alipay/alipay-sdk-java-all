package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非标汽车售卖模式扣款信息
 *
 * @author auto create
 * @since 1.0, 2025-12-17 11:05:19
 */
public class CarSubscriptionDeduction extends AlipayObject {

	private static final long serialVersionUID = 8613166139395542247L;

	/**
	 * 车辆押金扣款（元）
	 */
	@ApiField("car_deposit_deduct_amount")
	private String carDepositDeductAmount;

	/**
	 * 实际分佣金额（元）
	 */
	@ApiField("rental_fee_commission")
	private String rentalFeeCommission;

	/**
	 * 实际扣款金额（元）
	 */
	@ApiField("rental_fee_deduct_amount")
	private String rentalFeeDeductAmount;

	/**
	 * 实际扣款金额的组成部分：基础费（元）
	 */
	@ApiField("rental_fee_deduct_amount_of_basic")
	private String rentalFeeDeductAmountOfBasic;

	/**
	 * 实际扣款金额的组成部分：保险费（元）
	 */
	@ApiField("rental_fee_deduct_amount_of_insurance")
	private String rentalFeeDeductAmountOfInsurance;

	/**
	 * 实际扣款金额的组成部分：里程费（元）
	 */
	@ApiField("rental_fee_deduct_amount_of_mileage")
	private String rentalFeeDeductAmountOfMileage;

	/**
	 * 实际扣款金额的组成部分：指标费（元）
	 */
	@ApiField("rental_fee_deduct_amount_of_quota")
	private String rentalFeeDeductAmountOfQuota;

	/**
	 * 扣款期数
	 */
	@ApiField("rental_fee_deduct_round")
	private Long rentalFeeDeductRound;

	/**
	 * 扣款状态
	 */
	@ApiField("rental_fee_deduct_status")
	private String rentalFeeDeductStatus;

	/**
	 * 当期扣款时间
	 */
	@ApiField("rental_fee_deduct_time")
	private Date rentalFeeDeductTime;

	/**
	 * 违章押金扣款（元）
	 */
	@ApiField("traffic_violation_deposit_deduct_amount")
	private String trafficViolationDepositDeductAmount;

	public String getCarDepositDeductAmount() {
		return this.carDepositDeductAmount;
	}
	public void setCarDepositDeductAmount(String carDepositDeductAmount) {
		this.carDepositDeductAmount = carDepositDeductAmount;
	}

	public String getRentalFeeCommission() {
		return this.rentalFeeCommission;
	}
	public void setRentalFeeCommission(String rentalFeeCommission) {
		this.rentalFeeCommission = rentalFeeCommission;
	}

	public String getRentalFeeDeductAmount() {
		return this.rentalFeeDeductAmount;
	}
	public void setRentalFeeDeductAmount(String rentalFeeDeductAmount) {
		this.rentalFeeDeductAmount = rentalFeeDeductAmount;
	}

	public String getRentalFeeDeductAmountOfBasic() {
		return this.rentalFeeDeductAmountOfBasic;
	}
	public void setRentalFeeDeductAmountOfBasic(String rentalFeeDeductAmountOfBasic) {
		this.rentalFeeDeductAmountOfBasic = rentalFeeDeductAmountOfBasic;
	}

	public String getRentalFeeDeductAmountOfInsurance() {
		return this.rentalFeeDeductAmountOfInsurance;
	}
	public void setRentalFeeDeductAmountOfInsurance(String rentalFeeDeductAmountOfInsurance) {
		this.rentalFeeDeductAmountOfInsurance = rentalFeeDeductAmountOfInsurance;
	}

	public String getRentalFeeDeductAmountOfMileage() {
		return this.rentalFeeDeductAmountOfMileage;
	}
	public void setRentalFeeDeductAmountOfMileage(String rentalFeeDeductAmountOfMileage) {
		this.rentalFeeDeductAmountOfMileage = rentalFeeDeductAmountOfMileage;
	}

	public String getRentalFeeDeductAmountOfQuota() {
		return this.rentalFeeDeductAmountOfQuota;
	}
	public void setRentalFeeDeductAmountOfQuota(String rentalFeeDeductAmountOfQuota) {
		this.rentalFeeDeductAmountOfQuota = rentalFeeDeductAmountOfQuota;
	}

	public Long getRentalFeeDeductRound() {
		return this.rentalFeeDeductRound;
	}
	public void setRentalFeeDeductRound(Long rentalFeeDeductRound) {
		this.rentalFeeDeductRound = rentalFeeDeductRound;
	}

	public String getRentalFeeDeductStatus() {
		return this.rentalFeeDeductStatus;
	}
	public void setRentalFeeDeductStatus(String rentalFeeDeductStatus) {
		this.rentalFeeDeductStatus = rentalFeeDeductStatus;
	}

	public Date getRentalFeeDeductTime() {
		return this.rentalFeeDeductTime;
	}
	public void setRentalFeeDeductTime(Date rentalFeeDeductTime) {
		this.rentalFeeDeductTime = rentalFeeDeductTime;
	}

	public String getTrafficViolationDepositDeductAmount() {
		return this.trafficViolationDepositDeductAmount;
	}
	public void setTrafficViolationDepositDeductAmount(String trafficViolationDepositDeductAmount) {
		this.trafficViolationDepositDeductAmount = trafficViolationDepositDeductAmount;
	}

}
