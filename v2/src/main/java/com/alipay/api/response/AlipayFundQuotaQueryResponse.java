package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 11:58:10
 */
public class AlipayFundQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4133778685833443928L;

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
