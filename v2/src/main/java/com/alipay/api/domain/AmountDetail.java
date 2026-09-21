package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金分配明细
 *
 * @author auto create
 * @since 1.0, 2026-09-17 10:25:25
 */
public class AmountDetail extends AlipayObject {

	private static final long serialVersionUID = 2769237313688932637L;

	/**
	 * 总金额（元）,支持两位小数
	 */
	@ApiField("amount_total")
	private String amountTotal;

	/**
	 * 普通红包金额（元）,支持两位小数
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 授信金额（元）,支持两位小数
	 */
	@ApiField("credit_principal_amount")
	private String creditPrincipalAmount;

	/**
	 * 流量红包金额（元）,支持两位小数
	 */
	@ApiField("marketing_amount")
	private String marketingAmount;

	/**
	 * 现金金额（元）,支持两位小数
	 */
	@ApiField("principal_amount")
	private String principalAmount;

	public String getAmountTotal() {
		return this.amountTotal;
	}
	public void setAmountTotal(String amountTotal) {
		this.amountTotal = amountTotal;
	}

	public String getBenefitAmount() {
		return this.benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getCreditPrincipalAmount() {
		return this.creditPrincipalAmount;
	}
	public void setCreditPrincipalAmount(String creditPrincipalAmount) {
		this.creditPrincipalAmount = creditPrincipalAmount;
	}

	public String getMarketingAmount() {
		return this.marketingAmount;
	}
	public void setMarketingAmount(String marketingAmount) {
		this.marketingAmount = marketingAmount;
	}

	public String getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
	}

}
