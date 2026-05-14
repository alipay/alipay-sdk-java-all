package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-28 14:57:43
 */
public class AlipayFundQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7393569862152857522L;

	/** 
	 * 当active_new_quota_daily_remain_limited返回true时会有值，代表收到了限制，如果是安全限制需申请解限会返回SECURITY_PUNISHED，如果账户额度限制需先提升账户额度会返回ACCOUNT_QUOTA_LIMITED
	 */
	@ApiField("active_new_quota_daily_remain_limit_type")
	private String activeNewQuotaDailyRemainLimitType;

	/** 
	 * 标识单日剩余额度是否被其他规则限制，如果是，需要先解除限制；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("active_new_quota_daily_remain_limited")
	private Boolean activeNewQuotaDailyRemainLimited;

	/** 
	 * 当active_new_quota_monthly_remain_limited返回true时会有值，代表收到了限制，如果是安全限制需申请解限会返回SECURITY_PUNISHED，如果账户额度限制需先提升账户额度会返回ACCOUNT_QUOTA_LIMITED
	 */
	@ApiField("active_new_quota_monthly_remain_limit_type")
	private String activeNewQuotaMonthlyRemainLimitType;

	/** 
	 * 标识单月剩余额度是否被其他规则限制，如果是，需要先解除限制；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("active_new_quota_monthly_remain_limited")
	private Boolean activeNewQuotaMonthlyRemainLimited;

	/** 
	 * 当返回true时，表明查询返回的额度值以new_quota_开头字段返回值生效；否则，额度值以to_开头字段返回值生效
	 */
	@ApiField("active_quota_is_new")
	private Boolean activeQuotaIsNew;

	/** 
	 * 单日最高转账限额，单位为元，精确到小数点后两位；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("new_quota_daily")
	private String newQuotaDaily;

	/** 
	 * 单日剩余额度，单位为元，精确到小数点后两位；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("new_quota_daily_remain")
	private String newQuotaDailyRemain;

	/** 
	 * 单月最高转账限额，单位为元，精确到小数点后两位；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("new_quota_monthly")
	private String newQuotaMonthly;

	/** 
	 * 单月剩余额度	，单位为元，精确到小数点后两位；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("new_quota_monthly_remain")
	private String newQuotaMonthlyRemain;

	/** 
	 * 单笔最大金额，单位为元，精确到小数点后两位；当active_quota_is_new=true时，返回该字段
	 */
	@ApiField("new_quota_single_max")
	private String newQuotaSingleMax;

	/** 
	 * 单笔最小金额，单位为元，精确到小数点后两位；当active_quota_is_new=true且设置了最小额度时，返回该字段；
	 */
	@ApiField("new_quota_single_min")
	private String newQuotaSingleMin;

	/** 
	 * 对公日可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_corporate_daily_available_amount")
	private String toCorporateDailyAvailableAmount;

	/** 
	 * 对公月可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_corporate_monthly_available_amount")
	private String toCorporateMonthlyAvailableAmount;

	/** 
	 * 对私日可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_private_daily_available_amount")
	private String toPrivateDailyAvailableAmount;

	/** 
	 * 对私月可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_private_monthly_available_amount")
	private String toPrivateMonthlyAvailableAmount;

	public void setActiveNewQuotaDailyRemainLimitType(String activeNewQuotaDailyRemainLimitType) {
		this.activeNewQuotaDailyRemainLimitType = activeNewQuotaDailyRemainLimitType;
	}
	public String getActiveNewQuotaDailyRemainLimitType( ) {
		return this.activeNewQuotaDailyRemainLimitType;
	}

	public void setActiveNewQuotaDailyRemainLimited(Boolean activeNewQuotaDailyRemainLimited) {
		this.activeNewQuotaDailyRemainLimited = activeNewQuotaDailyRemainLimited;
	}
	public Boolean getActiveNewQuotaDailyRemainLimited( ) {
		return this.activeNewQuotaDailyRemainLimited;
	}

	public void setActiveNewQuotaMonthlyRemainLimitType(String activeNewQuotaMonthlyRemainLimitType) {
		this.activeNewQuotaMonthlyRemainLimitType = activeNewQuotaMonthlyRemainLimitType;
	}
	public String getActiveNewQuotaMonthlyRemainLimitType( ) {
		return this.activeNewQuotaMonthlyRemainLimitType;
	}

	public void setActiveNewQuotaMonthlyRemainLimited(Boolean activeNewQuotaMonthlyRemainLimited) {
		this.activeNewQuotaMonthlyRemainLimited = activeNewQuotaMonthlyRemainLimited;
	}
	public Boolean getActiveNewQuotaMonthlyRemainLimited( ) {
		return this.activeNewQuotaMonthlyRemainLimited;
	}

	public void setActiveQuotaIsNew(Boolean activeQuotaIsNew) {
		this.activeQuotaIsNew = activeQuotaIsNew;
	}
	public Boolean getActiveQuotaIsNew( ) {
		return this.activeQuotaIsNew;
	}

	public void setNewQuotaDaily(String newQuotaDaily) {
		this.newQuotaDaily = newQuotaDaily;
	}
	public String getNewQuotaDaily( ) {
		return this.newQuotaDaily;
	}

	public void setNewQuotaDailyRemain(String newQuotaDailyRemain) {
		this.newQuotaDailyRemain = newQuotaDailyRemain;
	}
	public String getNewQuotaDailyRemain( ) {
		return this.newQuotaDailyRemain;
	}

	public void setNewQuotaMonthly(String newQuotaMonthly) {
		this.newQuotaMonthly = newQuotaMonthly;
	}
	public String getNewQuotaMonthly( ) {
		return this.newQuotaMonthly;
	}

	public void setNewQuotaMonthlyRemain(String newQuotaMonthlyRemain) {
		this.newQuotaMonthlyRemain = newQuotaMonthlyRemain;
	}
	public String getNewQuotaMonthlyRemain( ) {
		return this.newQuotaMonthlyRemain;
	}

	public void setNewQuotaSingleMax(String newQuotaSingleMax) {
		this.newQuotaSingleMax = newQuotaSingleMax;
	}
	public String getNewQuotaSingleMax( ) {
		return this.newQuotaSingleMax;
	}

	public void setNewQuotaSingleMin(String newQuotaSingleMin) {
		this.newQuotaSingleMin = newQuotaSingleMin;
	}
	public String getNewQuotaSingleMin( ) {
		return this.newQuotaSingleMin;
	}

	public void setToCorporateDailyAvailableAmount(String toCorporateDailyAvailableAmount) {
		this.toCorporateDailyAvailableAmount = toCorporateDailyAvailableAmount;
	}
	public String getToCorporateDailyAvailableAmount( ) {
		return this.toCorporateDailyAvailableAmount;
	}

	public void setToCorporateMonthlyAvailableAmount(String toCorporateMonthlyAvailableAmount) {
		this.toCorporateMonthlyAvailableAmount = toCorporateMonthlyAvailableAmount;
	}
	public String getToCorporateMonthlyAvailableAmount( ) {
		return this.toCorporateMonthlyAvailableAmount;
	}

	public void setToPrivateDailyAvailableAmount(String toPrivateDailyAvailableAmount) {
		this.toPrivateDailyAvailableAmount = toPrivateDailyAvailableAmount;
	}
	public String getToPrivateDailyAvailableAmount( ) {
		return this.toPrivateDailyAvailableAmount;
	}

	public void setToPrivateMonthlyAvailableAmount(String toPrivateMonthlyAvailableAmount) {
		this.toPrivateMonthlyAvailableAmount = toPrivateMonthlyAvailableAmount;
	}
	public String getToPrivateMonthlyAvailableAmount( ) {
		return this.toPrivateMonthlyAvailableAmount;
	}

}
