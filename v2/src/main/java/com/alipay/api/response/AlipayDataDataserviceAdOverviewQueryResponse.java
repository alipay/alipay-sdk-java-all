package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.overview.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AlipayDataDataserviceAdOverviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4321596948495236461L;

	/** 
	 * 账户余额(元)
	 */
	@ApiField("account_amount_total")
	private String accountAmountTotal;

	/** 
	 * 可用余额(元)
	 */
	@ApiField("format_available_amount_total")
	private String formatAvailableAmountTotal;

	/** 
	 * 授信(元)
	 */
	@ApiField("format_credit_amount")
	private String formatCreditAmount;

	/** 
	 * 不可用余额(元)
	 */
	@ApiField("format_not_available_amount_total")
	private String formatNotAvailableAmountTotal;

	/** 
	 * 现金(元)
	 */
	@ApiField("format_principal_amount")
	private String formatPrincipalAmount;

	/** 
	 * 红包(元)
	 */
	@ApiField("format_red_envelope_amount")
	private String formatRedEnvelopeAmount;

	public void setAccountAmountTotal(String accountAmountTotal) {
		this.accountAmountTotal = accountAmountTotal;
	}
	public String getAccountAmountTotal( ) {
		return this.accountAmountTotal;
	}

	public void setFormatAvailableAmountTotal(String formatAvailableAmountTotal) {
		this.formatAvailableAmountTotal = formatAvailableAmountTotal;
	}
	public String getFormatAvailableAmountTotal( ) {
		return this.formatAvailableAmountTotal;
	}

	public void setFormatCreditAmount(String formatCreditAmount) {
		this.formatCreditAmount = formatCreditAmount;
	}
	public String getFormatCreditAmount( ) {
		return this.formatCreditAmount;
	}

	public void setFormatNotAvailableAmountTotal(String formatNotAvailableAmountTotal) {
		this.formatNotAvailableAmountTotal = formatNotAvailableAmountTotal;
	}
	public String getFormatNotAvailableAmountTotal( ) {
		return this.formatNotAvailableAmountTotal;
	}

	public void setFormatPrincipalAmount(String formatPrincipalAmount) {
		this.formatPrincipalAmount = formatPrincipalAmount;
	}
	public String getFormatPrincipalAmount( ) {
		return this.formatPrincipalAmount;
	}

	public void setFormatRedEnvelopeAmount(String formatRedEnvelopeAmount) {
		this.formatRedEnvelopeAmount = formatRedEnvelopeAmount;
	}
	public String getFormatRedEnvelopeAmount( ) {
		return this.formatRedEnvelopeAmount;
	}

}
