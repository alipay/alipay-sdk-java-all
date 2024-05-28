package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁价格详情
 *
 * @author auto create
 * @since 1.0, 2024-05-24 12:08:21
 */
public class RentPriceDetail extends AlipayObject {

	private static final long serialVersionUID = 4893228471553997389L;

	/**
	 * 买断金额（单位：分）
	 */
	@ApiField("buyout_price")
	private Long buyoutPrice;

	/**
	 * 押金（单位：分）
	 */
	@ApiField("deposit_price")
	private Long depositPrice;

	/**
	 * 尾期租金（单位：分）
	 */
	@ApiField("finish_real_rent_price")
	private Long finishRealRentPrice;

	/**
	 * 首期租金（单位：分）
	 */
	@ApiField("initial_rent_price")
	private Long initialRentPrice;

	/**
	 * 租赁期数
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 每期租金（单位：分）
	 */
	@ApiField("period_real_rent_price")
	private Long periodRealRentPrice;

	/**
	 * 预授权金额（单位：分）
	 */
	@ApiField("pre_authorization_amount")
	private Long preAuthorizationAmount;

	/**
	 * 实付总金额（单位：分）
	 */
	@ApiField("real_pay_amount")
	private Long realPayAmount;

	/**
	 * 租期结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租期开始时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public Long getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(Long buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public Long getDepositPrice() {
		return this.depositPrice;
	}
	public void setDepositPrice(Long depositPrice) {
		this.depositPrice = depositPrice;
	}

	public Long getFinishRealRentPrice() {
		return this.finishRealRentPrice;
	}
	public void setFinishRealRentPrice(Long finishRealRentPrice) {
		this.finishRealRentPrice = finishRealRentPrice;
	}

	public Long getInitialRentPrice() {
		return this.initialRentPrice;
	}
	public void setInitialRentPrice(Long initialRentPrice) {
		this.initialRentPrice = initialRentPrice;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public Long getPeriodRealRentPrice() {
		return this.periodRealRentPrice;
	}
	public void setPeriodRealRentPrice(Long periodRealRentPrice) {
		this.periodRealRentPrice = periodRealRentPrice;
	}

	public Long getPreAuthorizationAmount() {
		return this.preAuthorizationAmount;
	}
	public void setPreAuthorizationAmount(Long preAuthorizationAmount) {
		this.preAuthorizationAmount = preAuthorizationAmount;
	}

	public Long getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(Long realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public Date getRentEndTime() {
		return this.rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}

	public Date getRentStartTime() {
		return this.rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}

}
