package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定价商家效果列表返回类型
 *
 * @author auto create
 * @since 1.0, 2019-10-25 11:18:49
 */
public class MerchantEffectQueryResult extends AlipayObject {

	private static final long serialVersionUID = 8762858375672668825L;

	/**
	 * 累计充值笔数
	 */
	@ApiField("accumulative_recharge_nums")
	private String accumulativeRechargeNums;

	/**
	 * 累计到该天的补贴
	 */
	@ApiField("accumulative_total_allowance")
	private String accumulativeTotalAllowance;

	/**
	 * 累计开启天数
	 */
	@ApiField("accumulative_total_days")
	private String accumulativeTotalDays;

	/**
	 * 累计到该天的收入
	 */
	@ApiField("accumulative_total_income")
	private String accumulativeTotalIncome;

	/**
	 * 平均充值/赠送比(单位为分)
	 */
	@ApiField("average_recharge_allowance_rate")
	private String averageRechargeAllowanceRate;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 有效收入增收
	 */
	@ApiField("effective_increased_income")
	private String effectiveIncreasedIncome;

	/**
	 * 累计商户有效收入
	 */
	@ApiField("increased_income")
	private String increasedIncome;

	/**
	 * 当天商户补贴
	 */
	@ApiField("merchant_allowance")
	private String merchantAllowance;

	/**
	 * 当天商户收入
	 */
	@ApiField("merchant_income")
	private String merchantIncome;

	/**
	 * 核销率
	 */
	@ApiField("use_rate")
	private String useRate;

	public String getAccumulativeRechargeNums() {
		return this.accumulativeRechargeNums;
	}
	public void setAccumulativeRechargeNums(String accumulativeRechargeNums) {
		this.accumulativeRechargeNums = accumulativeRechargeNums;
	}

	public String getAccumulativeTotalAllowance() {
		return this.accumulativeTotalAllowance;
	}
	public void setAccumulativeTotalAllowance(String accumulativeTotalAllowance) {
		this.accumulativeTotalAllowance = accumulativeTotalAllowance;
	}

	public String getAccumulativeTotalDays() {
		return this.accumulativeTotalDays;
	}
	public void setAccumulativeTotalDays(String accumulativeTotalDays) {
		this.accumulativeTotalDays = accumulativeTotalDays;
	}

	public String getAccumulativeTotalIncome() {
		return this.accumulativeTotalIncome;
	}
	public void setAccumulativeTotalIncome(String accumulativeTotalIncome) {
		this.accumulativeTotalIncome = accumulativeTotalIncome;
	}

	public String getAverageRechargeAllowanceRate() {
		return this.averageRechargeAllowanceRate;
	}
	public void setAverageRechargeAllowanceRate(String averageRechargeAllowanceRate) {
		this.averageRechargeAllowanceRate = averageRechargeAllowanceRate;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getEffectiveIncreasedIncome() {
		return this.effectiveIncreasedIncome;
	}
	public void setEffectiveIncreasedIncome(String effectiveIncreasedIncome) {
		this.effectiveIncreasedIncome = effectiveIncreasedIncome;
	}

	public String getIncreasedIncome() {
		return this.increasedIncome;
	}
	public void setIncreasedIncome(String increasedIncome) {
		this.increasedIncome = increasedIncome;
	}

	public String getMerchantAllowance() {
		return this.merchantAllowance;
	}
	public void setMerchantAllowance(String merchantAllowance) {
		this.merchantAllowance = merchantAllowance;
	}

	public String getMerchantIncome() {
		return this.merchantIncome;
	}
	public void setMerchantIncome(String merchantIncome) {
		this.merchantIncome = merchantIncome;
	}

	public String getUseRate() {
		return this.useRate;
	}
	public void setUseRate(String useRate) {
		this.useRate = useRate;
	}

}
