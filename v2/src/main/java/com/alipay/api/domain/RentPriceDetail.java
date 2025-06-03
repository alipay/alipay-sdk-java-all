package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁价格详情
 *
 * @author auto create
 * @since 1.0, 2024-07-08 21:59:50
 */
public class RentPriceDetail extends AlipayObject {

	private static final long serialVersionUID = 1786421273727424173L;

	/**
	 * 买断价格。单位元，精度分。
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 押金。单位元，精度分。
	 */
	@ApiField("deposit_price")
	private String depositPrice;

	/**
	 * 尾期租金。单位元，精度分。
	 */
	@ApiField("finish_real_rent_price")
	private String finishRealRentPrice;

	/**
	 * 首期租金。单位元，精度分。
	 */
	@ApiField("initial_rent_price")
	private String initialRentPrice;

	/**
	 * 租赁期数，单位：期
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 每期租金。单位元，精度分。
	 */
	@ApiField("period_real_rent_price")
	private String periodRealRentPrice;

	/**
	 * 预授权金额。单位元，精度分。
	 */
	@ApiField("pre_authorization_amount")
	private String preAuthorizationAmount;

	/**
	 * 实付总金额。单位元，精度分。
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

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

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public String getDepositPrice() {
		return this.depositPrice;
	}
	public void setDepositPrice(String depositPrice) {
		this.depositPrice = depositPrice;
	}

	public String getFinishRealRentPrice() {
		return this.finishRealRentPrice;
	}
	public void setFinishRealRentPrice(String finishRealRentPrice) {
		this.finishRealRentPrice = finishRealRentPrice;
	}

	public String getInitialRentPrice() {
		return this.initialRentPrice;
	}
	public void setInitialRentPrice(String initialRentPrice) {
		this.initialRentPrice = initialRentPrice;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public String getPeriodRealRentPrice() {
		return this.periodRealRentPrice;
	}
	public void setPeriodRealRentPrice(String periodRealRentPrice) {
		this.periodRealRentPrice = periodRealRentPrice;
	}

	public String getPreAuthorizationAmount() {
		return this.preAuthorizationAmount;
	}
	public void setPreAuthorizationAmount(String preAuthorizationAmount) {
		this.preAuthorizationAmount = preAuthorizationAmount;
	}

	public String getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(String realPayAmount) {
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
