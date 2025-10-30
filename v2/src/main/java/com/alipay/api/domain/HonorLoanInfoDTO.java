package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀借款信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class HonorLoanInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2668641687349167841L;

	/**
	 * 年利率, 0.18 (年化)
	 */
	@ApiField("apr")
	private String apr;

	/**
	 * 支付宝绑卡id
	 */
	@ApiField("bank_card_id")
	private String bankCardId;

	/**
	 * 借款优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 日利率,0.06 (年化/360*100) 保留6位数
	 */
	@ApiField("day_rate")
	private String dayRate;

	/**
	 * 起息日期,格式yyyyMMdd
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 放款成功时间，时间戳毫秒
	 */
	@ApiField("loan_time")
	private Long loanTime;

	/**
	 * 借款用途
	 */
	@ApiField("loan_use")
	private String loanUse;

	/**
	 * 还款方式，枚举值：
1-等额本息(灵活还)，2-等额本金(灵活还)，3-先息后本(灵活还)，4-等额本息(按期还)
	 */
	@ApiField("repay_method")
	private Long repayMethod;

	/**
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	public String getApr() {
		return this.apr;
	}
	public void setApr(String apr) {
		this.apr = apr;
	}

	public String getBankCardId() {
		return this.bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getDayRate() {
		return this.dayRate;
	}
	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Long getLoanTime() {
		return this.loanTime;
	}
	public void setLoanTime(Long loanTime) {
		this.loanTime = loanTime;
	}

	public String getLoanUse() {
		return this.loanUse;
	}
	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}

	public Long getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(Long repayMethod) {
		this.repayMethod = repayMethod;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}
	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

}
