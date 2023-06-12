package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信额度详情
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:10:23
 */
public class CreditQuotaDetail extends AlipayObject {

	private static final long serialVersionUID = 5411662326945911282L;

	/**
	 * 授信期限
	 */
	@ApiField("credit_term")
	private String creditTerm;

	/**
	 * 授信期限单位，DAY-日，MONTH-月，YEAR-年
	 */
	@ApiField("credit_term_unit")
	private String creditTermUnit;

	/**
	 * 授信有效期结束日，格式（yyyy-MM-dd）
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 额度类型，CREDIT - 信用，ORDER - 订单，MORTGAGE - 抵押，MAXIMUM - 最大额度
	 */
	@ApiField("loan_quota_type")
	private String loanQuotaType;

	/**
	 * 申请授信额度，币种最小单位，如果是CNY，则单位分
	 */
	@ApiField("quota_amount")
	private Long quotaAmount;

	/**
	 * 申请授信额度币种
	 */
	@ApiField("quota_amount_currency")
	private String quotaAmountCurrency;

	/**
	 * 授信有效期开始日，格式（yyyy-MM-dd）
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCreditTerm() {
		return this.creditTerm;
	}
	public void setCreditTerm(String creditTerm) {
		this.creditTerm = creditTerm;
	}

	public String getCreditTermUnit() {
		return this.creditTermUnit;
	}
	public void setCreditTermUnit(String creditTermUnit) {
		this.creditTermUnit = creditTermUnit;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLoanQuotaType() {
		return this.loanQuotaType;
	}
	public void setLoanQuotaType(String loanQuotaType) {
		this.loanQuotaType = loanQuotaType;
	}

	public Long getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(Long quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getQuotaAmountCurrency() {
		return this.quotaAmountCurrency;
	}
	public void setQuotaAmountCurrency(String quotaAmountCurrency) {
		this.quotaAmountCurrency = quotaAmountCurrency;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
