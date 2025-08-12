package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易明细对象
 *
 * @author auto create
 * @since 1.0, 2024-11-07 09:48:37
 */
public class PayFlowTransDetailInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3734847126814133768L;

	/**
	 * 支付宝交易金额（按月汇总，单位：元）
	 */
	@ApiField("alipay_total_amt")
	private String alipayTotalAmt;

	/**
	 * 支付宝交易笔数（按月汇总）
	 */
	@ApiField("alipay_total_cnt")
	private String alipayTotalCnt;

	/**
	 * 交易天数（本月累计）
	 */
	@ApiField("all_days")
	private String allDays;

	/**
	 * 现金支付交易金额（按月汇总，单位：元）
	 */
	@ApiField("cash_amt")
	private String cashAmt;

	/**
	 * 现金支付交易笔数（按月汇总）
	 */
	@ApiField("cash_cnt")
	private String cashCnt;

	/**
	 * 信用卡(贷记卡) 交易金额（按月汇总，单位：元）
	 */
	@ApiField("credit_card_amt")
	private String creditCardAmt;

	/**
	 * 信用卡(贷记卡) 交易笔数（按月汇总）
	 */
	@ApiField("credit_card_cnt")
	private String creditCardCnt;

	/**
	 * 交易客户数
	 */
	@ApiField("custom_num")
	private String customNum;

	/**
	 * 储蓄卡(借记银行卡) 交易金额（按月汇总，单位：元）
	 */
	@ApiField("debit_card_amt")
	private String debitCardAmt;

	/**
	 * 储蓄卡(借记银行卡) 交易笔数（按月汇总）
	 */
	@ApiField("debit_card_cnt")
	private String debitCardCnt;

	/**
	 * 失败交易总金额（月度，单位：元）
	 */
	@ApiField("failed_amt")
	private String failedAmt;

	/**
	 * 失败交易总笔数（月度）
	 */
	@ApiField("failed_cnt")
	private String failedCnt;

	/**
	 * 虚假交易金额（按月汇总，单位：元）
	 */
	@ApiField("fraud_amt")
	private String fraudAmt;

	/**
	 * 虚假交易笔数（按月汇总）
	 */
	@ApiField("fraud_cnt")
	private String fraudCnt;

	/**
	 * 高频消费客户消费总金额（单位：元）
	 */
	@ApiField("high_amt")
	private String highAmt;

	/**
	 * 高频消费客户消费总笔数
	 */
	@ApiField("high_cnt")
	private String highCnt;

	/**
	 * 高频消费客户数
	 */
	@ApiField("high_frequency_custom")
	private String highFrequencyCustom;

	/**
	 * 月度内单笔最大金额（单位：元）
	 */
	@ApiField("max_amt")
	private String maxAmt;

	/**
	 * 单日最大交易金额（单位：元）
	 */
	@ApiField("max_day_amt")
	private String maxDayAmt;

	/**
	 * 单日最大交易笔数
	 */
	@ApiField("max_day_cnt")
	private String maxDayCnt;

	/**
	 * 单笔最小交易金额（单位：元）
	 */
	@ApiField("min_amt")
	private String minAmt;

	/**
	 * 单日最小交易金额（单位：元）
	 */
	@ApiField("min_day_amt")
	private String minDayAmt;

	/**
	 * 单日最小交易笔数
	 */
	@ApiField("min_day_cnt")
	private String minDayCnt;

	/**
	 * 夜间交易金额（单位：元）
	 */
	@ApiField("night_amt")
	private String nightAmt;

	/**
	 * 夜间交易笔数
	 */
	@ApiField("night_cnt")
	private String nightCnt;

	/**
	 * 其他移动支付工具(非支付宝和微信)交易金额（按月汇总，单位：元）
	 */
	@ApiField("other_amt")
	private String otherAmt;

	/**
	 * 其他移动支付工具(非支付宝和微信)交易笔数（按月汇总）
	 */
	@ApiField("other_cnt")
	private String otherCnt;

	/**
	 * 90%分位交易金额（单位：元）
	 */
	@ApiField("pct_90_ord_amt")
	private String pct90OrdAmt;

	/**
	 * 95%分位交易金额（月度，单位：元）
	 */
	@ApiField("pct_95_ord_amt")
	private String pct95OrdAmt;

	/**
	 * 老客消费客户数
	 */
	@ApiField("repeat_custom")
	private String repeatCustom;

	/**
	 * 老客消费客户消费总金额（单位：元）
	 */
	@ApiField("repeat_custom_amt")
	private String repeatCustomAmt;

	/**
	 * 老客消费客户消费总笔数
	 */
	@ApiField("repeat_custom_cnt")
	private String repeatCustomCnt;

	/**
	 * 总交易金额（单位：元）
	 */
	@ApiField("total_amt")
	private String totalAmt;

	/**
	 * 总交易笔数
	 */
	@ApiField("total_cnt")
	private String totalCnt;

	/**
	 * 统计月份
	 */
	@ApiField("vintage")
	private String vintage;

	/**
	 * 凌晨交易金额（单位：元）
	 */
	@ApiField("wee_hours_amt")
	private String weeHoursAmt;

	/**
	 * 凌晨交易笔数
	 */
	@ApiField("wee_hours_cnt")
	private String weeHoursCnt;

	/**
	 * 周末交易金额（单位：元）
	 */
	@ApiField("weekend_amt")
	private String weekendAmt;

	/**
	 * 周末交易笔数
	 */
	@ApiField("weekend_cnt")
	private String weekendCnt;

	/**
	 * 微信支付交易金额（按月汇总，单位：元）
	 */
	@ApiField("wx_total_amt")
	private String wxTotalAmt;

	/**
	 * 微信支付交易笔数（按月汇总）
	 */
	@ApiField("wx_total_cnt")
	private String wxTotalCnt;

	public String getAlipayTotalAmt() {
		return this.alipayTotalAmt;
	}
	public void setAlipayTotalAmt(String alipayTotalAmt) {
		this.alipayTotalAmt = alipayTotalAmt;
	}

	public String getAlipayTotalCnt() {
		return this.alipayTotalCnt;
	}
	public void setAlipayTotalCnt(String alipayTotalCnt) {
		this.alipayTotalCnt = alipayTotalCnt;
	}

	public String getAllDays() {
		return this.allDays;
	}
	public void setAllDays(String allDays) {
		this.allDays = allDays;
	}

	public String getCashAmt() {
		return this.cashAmt;
	}
	public void setCashAmt(String cashAmt) {
		this.cashAmt = cashAmt;
	}

	public String getCashCnt() {
		return this.cashCnt;
	}
	public void setCashCnt(String cashCnt) {
		this.cashCnt = cashCnt;
	}

	public String getCreditCardAmt() {
		return this.creditCardAmt;
	}
	public void setCreditCardAmt(String creditCardAmt) {
		this.creditCardAmt = creditCardAmt;
	}

	public String getCreditCardCnt() {
		return this.creditCardCnt;
	}
	public void setCreditCardCnt(String creditCardCnt) {
		this.creditCardCnt = creditCardCnt;
	}

	public String getCustomNum() {
		return this.customNum;
	}
	public void setCustomNum(String customNum) {
		this.customNum = customNum;
	}

	public String getDebitCardAmt() {
		return this.debitCardAmt;
	}
	public void setDebitCardAmt(String debitCardAmt) {
		this.debitCardAmt = debitCardAmt;
	}

	public String getDebitCardCnt() {
		return this.debitCardCnt;
	}
	public void setDebitCardCnt(String debitCardCnt) {
		this.debitCardCnt = debitCardCnt;
	}

	public String getFailedAmt() {
		return this.failedAmt;
	}
	public void setFailedAmt(String failedAmt) {
		this.failedAmt = failedAmt;
	}

	public String getFailedCnt() {
		return this.failedCnt;
	}
	public void setFailedCnt(String failedCnt) {
		this.failedCnt = failedCnt;
	}

	public String getFraudAmt() {
		return this.fraudAmt;
	}
	public void setFraudAmt(String fraudAmt) {
		this.fraudAmt = fraudAmt;
	}

	public String getFraudCnt() {
		return this.fraudCnt;
	}
	public void setFraudCnt(String fraudCnt) {
		this.fraudCnt = fraudCnt;
	}

	public String getHighAmt() {
		return this.highAmt;
	}
	public void setHighAmt(String highAmt) {
		this.highAmt = highAmt;
	}

	public String getHighCnt() {
		return this.highCnt;
	}
	public void setHighCnt(String highCnt) {
		this.highCnt = highCnt;
	}

	public String getHighFrequencyCustom() {
		return this.highFrequencyCustom;
	}
	public void setHighFrequencyCustom(String highFrequencyCustom) {
		this.highFrequencyCustom = highFrequencyCustom;
	}

	public String getMaxAmt() {
		return this.maxAmt;
	}
	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}

	public String getMaxDayAmt() {
		return this.maxDayAmt;
	}
	public void setMaxDayAmt(String maxDayAmt) {
		this.maxDayAmt = maxDayAmt;
	}

	public String getMaxDayCnt() {
		return this.maxDayCnt;
	}
	public void setMaxDayCnt(String maxDayCnt) {
		this.maxDayCnt = maxDayCnt;
	}

	public String getMinAmt() {
		return this.minAmt;
	}
	public void setMinAmt(String minAmt) {
		this.minAmt = minAmt;
	}

	public String getMinDayAmt() {
		return this.minDayAmt;
	}
	public void setMinDayAmt(String minDayAmt) {
		this.minDayAmt = minDayAmt;
	}

	public String getMinDayCnt() {
		return this.minDayCnt;
	}
	public void setMinDayCnt(String minDayCnt) {
		this.minDayCnt = minDayCnt;
	}

	public String getNightAmt() {
		return this.nightAmt;
	}
	public void setNightAmt(String nightAmt) {
		this.nightAmt = nightAmt;
	}

	public String getNightCnt() {
		return this.nightCnt;
	}
	public void setNightCnt(String nightCnt) {
		this.nightCnt = nightCnt;
	}

	public String getOtherAmt() {
		return this.otherAmt;
	}
	public void setOtherAmt(String otherAmt) {
		this.otherAmt = otherAmt;
	}

	public String getOtherCnt() {
		return this.otherCnt;
	}
	public void setOtherCnt(String otherCnt) {
		this.otherCnt = otherCnt;
	}

	public String getPct90OrdAmt() {
		return this.pct90OrdAmt;
	}
	public void setPct90OrdAmt(String pct90OrdAmt) {
		this.pct90OrdAmt = pct90OrdAmt;
	}

	public String getPct95OrdAmt() {
		return this.pct95OrdAmt;
	}
	public void setPct95OrdAmt(String pct95OrdAmt) {
		this.pct95OrdAmt = pct95OrdAmt;
	}

	public String getRepeatCustom() {
		return this.repeatCustom;
	}
	public void setRepeatCustom(String repeatCustom) {
		this.repeatCustom = repeatCustom;
	}

	public String getRepeatCustomAmt() {
		return this.repeatCustomAmt;
	}
	public void setRepeatCustomAmt(String repeatCustomAmt) {
		this.repeatCustomAmt = repeatCustomAmt;
	}

	public String getRepeatCustomCnt() {
		return this.repeatCustomCnt;
	}
	public void setRepeatCustomCnt(String repeatCustomCnt) {
		this.repeatCustomCnt = repeatCustomCnt;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTotalCnt() {
		return this.totalCnt;
	}
	public void setTotalCnt(String totalCnt) {
		this.totalCnt = totalCnt;
	}

	public String getVintage() {
		return this.vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}

	public String getWeeHoursAmt() {
		return this.weeHoursAmt;
	}
	public void setWeeHoursAmt(String weeHoursAmt) {
		this.weeHoursAmt = weeHoursAmt;
	}

	public String getWeeHoursCnt() {
		return this.weeHoursCnt;
	}
	public void setWeeHoursCnt(String weeHoursCnt) {
		this.weeHoursCnt = weeHoursCnt;
	}

	public String getWeekendAmt() {
		return this.weekendAmt;
	}
	public void setWeekendAmt(String weekendAmt) {
		this.weekendAmt = weekendAmt;
	}

	public String getWeekendCnt() {
		return this.weekendCnt;
	}
	public void setWeekendCnt(String weekendCnt) {
		this.weekendCnt = weekendCnt;
	}

	public String getWxTotalAmt() {
		return this.wxTotalAmt;
	}
	public void setWxTotalAmt(String wxTotalAmt) {
		this.wxTotalAmt = wxTotalAmt;
	}

	public String getWxTotalCnt() {
		return this.wxTotalCnt;
	}
	public void setWxTotalCnt(String wxTotalCnt) {
		this.wxTotalCnt = wxTotalCnt;
	}

}
