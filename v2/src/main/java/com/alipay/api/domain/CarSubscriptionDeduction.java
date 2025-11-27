package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款信息
 *
 * @author auto create
 * @since 1.0, 2025-11-11 16:17:05
 */
public class CarSubscriptionDeduction extends AlipayObject {

	private static final long serialVersionUID = 5422264729734717783L;

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
