package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业产品银行卡收款月度额度
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:01
 */
public class BankQuotaResult extends AlipayObject {

	private static final long serialVersionUID = 3494224599811139197L;

	/**
	 * 月度额度（单位：元）
	 */
	@ApiField("limit_amount")
	private String limitAmount;

	/**
	 * 额度月份
	 */
	@ApiField("quota_month")
	private String quotaMonth;

	/**
	 * 剩余额度（单位：元）
	 */
	@ApiField("remaining_amount")
	private String remainingAmount;

	public String getLimitAmount() {
		return this.limitAmount;
	}
	public void setLimitAmount(String limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getQuotaMonth() {
		return this.quotaMonth;
	}
	public void setQuotaMonth(String quotaMonth) {
		this.quotaMonth = quotaMonth;
	}

	public String getRemainingAmount() {
		return this.remainingAmount;
	}
	public void setRemainingAmount(String remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

}
