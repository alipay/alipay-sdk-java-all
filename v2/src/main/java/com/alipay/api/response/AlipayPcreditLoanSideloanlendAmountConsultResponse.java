package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.amount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:44
 */
public class AlipayPcreditLoanSideloanlendAmountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2199257272597789518L;

	/** 
	 * 授信总额度，单位元，保留?数点后两位
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	/** 
	 * 日利率，6位小数
	 */
	@ApiField("daily_interest_rate")
	private String dailyInterestRate;

	/** 
	 * 授信失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 年利率，6位?数，日利率*360
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/** 
	 * SUCCESS - 成功、NEED_RETRY - 需要重试、FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 支用不准入
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 授信额度查询失败时对应二级错误码的错误描述
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 额度?效?期
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 授信生效状态，VALID 正常、FROZEN 冻结、INVALID 失效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 剩余可?授信额度，单位元，保留小数点后两位，包含临时额度
	 */
	@ApiField("surplus_quota")
	private String surplusQuota;

	/** 
	 * 临时授信额度，单位元，保留2位小数
	 */
	@ApiField("temp_credit_quota")
	private String tempCreditQuota;

	/** 
	 * 2023-02-01 18:00:00	临时授信额度失效?期，当临时
额度存在时，必填。2023-01-01 23:59:59 代表到有
效期到【2023-01-01 23:59:59】，过了这?秒，下?
秒就不可?了
	 */
	@ApiField("temp_credit_quota_end_time")
	private Date tempCreditQuotaEndTime;

	/** 
	 * 临时授信额度?效?期，当临时额度存在时，必填
	 */
	@ApiField("temp_credit_quota_start_time")
	private Date tempCreditQuotaStartTime;

	/** 
	 * 限时降价临时日利率，保留小数点后6位
	 */
	@ApiField("temp_daily_interest_rate")
	private String tempDailyInterestRate;

	/** 
	 * 限时降价临时年利率，6位小数
	 */
	@ApiField("temp_interest_rate")
	private String tempInterestRate;

	/** 
	 * 限时降价临时利率失效时间，当临时年利率存在时，必填
精确到秒，需要给到精确到秒的结果。2023-01-01 23:59:59 代表到有效期到【2023-01-01 23:59:59】，过了这?秒，下?秒就不可?了
	 */
	@ApiField("temp_interest_rate_end_time")
	private Date tempInterestRateEndTime;

	/** 
	 * 限时降价临时利率?效时间，当临时年利率存在时，必填
	 */
	@ApiField("temp_interest_rate_start_time")
	private Date tempInterestRateStartTime;

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}
	public String getCreditQuota( ) {
		return this.creditQuota;
	}

	public void setDailyInterestRate(String dailyInterestRate) {
		this.dailyInterestRate = dailyInterestRate;
	}
	public String getDailyInterestRate( ) {
		return this.dailyInterestRate;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getInterestRate( ) {
		return this.interestRate;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSurplusQuota(String surplusQuota) {
		this.surplusQuota = surplusQuota;
	}
	public String getSurplusQuota( ) {
		return this.surplusQuota;
	}

	public void setTempCreditQuota(String tempCreditQuota) {
		this.tempCreditQuota = tempCreditQuota;
	}
	public String getTempCreditQuota( ) {
		return this.tempCreditQuota;
	}

	public void setTempCreditQuotaEndTime(Date tempCreditQuotaEndTime) {
		this.tempCreditQuotaEndTime = tempCreditQuotaEndTime;
	}
	public Date getTempCreditQuotaEndTime( ) {
		return this.tempCreditQuotaEndTime;
	}

	public void setTempCreditQuotaStartTime(Date tempCreditQuotaStartTime) {
		this.tempCreditQuotaStartTime = tempCreditQuotaStartTime;
	}
	public Date getTempCreditQuotaStartTime( ) {
		return this.tempCreditQuotaStartTime;
	}

	public void setTempDailyInterestRate(String tempDailyInterestRate) {
		this.tempDailyInterestRate = tempDailyInterestRate;
	}
	public String getTempDailyInterestRate( ) {
		return this.tempDailyInterestRate;
	}

	public void setTempInterestRate(String tempInterestRate) {
		this.tempInterestRate = tempInterestRate;
	}
	public String getTempInterestRate( ) {
		return this.tempInterestRate;
	}

	public void setTempInterestRateEndTime(Date tempInterestRateEndTime) {
		this.tempInterestRateEndTime = tempInterestRateEndTime;
	}
	public Date getTempInterestRateEndTime( ) {
		return this.tempInterestRateEndTime;
	}

	public void setTempInterestRateStartTime(Date tempInterestRateStartTime) {
		this.tempInterestRateStartTime = tempInterestRateStartTime;
	}
	public Date getTempInterestRateStartTime( ) {
		return this.tempInterestRateStartTime;
	}

}
