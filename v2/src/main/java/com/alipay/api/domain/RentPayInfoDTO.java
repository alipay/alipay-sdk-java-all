package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁支付明细
 *
 * @author auto create
 * @since 1.0, 2025-07-10 10:55:18
 */
public class RentPayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6859893788394246268L;

	/**
	 * 支付金额，单位元
	 */
	@ApiField("act_pay_amount")
	private String actPayAmount;

	/**
	 * 支付时间
	 */
	@ApiField("act_pay_time")
	private Date actPayTime;

	/**
	 * 填写支付资金类型，例如租金 RENT，买断金 BUYOUT
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 租赁期数，fund_type=rent 必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 优惠金额，单位元
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	/**
	 * 租赁阶段，fund_type=rent 必填
	 */
	@ApiField("stage")
	private String stage;

	public String getActPayAmount() {
		return this.actPayAmount;
	}
	public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}

	public Date getActPayTime() {
		return this.actPayTime;
	}
	public void setActPayTime(Date actPayTime) {
		this.actPayTime = actPayTime;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

}
