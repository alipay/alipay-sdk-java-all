package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费计划
 *
 * @author auto create
 * @since 1.0, 2025-07-15 17:45:02
 */
public class ContinuousPlan extends AlipayObject {

	private static final long serialVersionUID = 7136219712459289167L;

	/**
	 * 缴费完成时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("continuous_finish_time")
	private Date continuousFinishTime;

	/**
	 * 续期缴费结束时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("continuous_grace_time")
	private Date continuousGraceTime;

	/**
	 * 续期缴费开始时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("continuous_start_time")
	private Date continuousStartTime;

	/**
	 * 货币类型，枚举值
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 交易流水号
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/**
	 * 期数
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 序号
	 */
	@ApiField("plan_index")
	private Long planIndex;

	/**
	 * 计划编号，缴费计划明细的唯一标识
	 */
	@ApiField("plan_no")
	private String planNo;

	/**
	 * 续期保费
单位：币种标准单位，如：人民币-元（保留2位小数）
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 续期状态
	 */
	@ApiField("renewal_status")
	private String renewalStatus;

	public Date getContinuousFinishTime() {
		return this.continuousFinishTime;
	}
	public void setContinuousFinishTime(Date continuousFinishTime) {
		this.continuousFinishTime = continuousFinishTime;
	}

	public Date getContinuousGraceTime() {
		return this.continuousGraceTime;
	}
	public void setContinuousGraceTime(Date continuousGraceTime) {
		this.continuousGraceTime = continuousGraceTime;
	}

	public Date getContinuousStartTime() {
		return this.continuousStartTime;
	}
	public void setContinuousStartTime(Date continuousStartTime) {
		this.continuousStartTime = continuousStartTime;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayTradeNo() {
		return this.payTradeNo;
	}
	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Long getPlanIndex() {
		return this.planIndex;
	}
	public void setPlanIndex(Long planIndex) {
		this.planIndex = planIndex;
	}

	public String getPlanNo() {
		return this.planNo;
	}
	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}
	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
	}

}
