package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.creditrisk.dashboard.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditCreditriskDashboardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2341185913584697495L;

	/** 
	 * 信用贷款额度
	 */
	@ApiField("credit_loan")
	private String creditLoan;

	/** 
	 * 售后退款金额
	 */
	@ApiField("sale_refund")
	private String saleRefund;

	/** 
	 * 交易服务费
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/** 
	 * 收入总计
	 */
	@ApiField("total_income")
	private String totalIncome;

	/** 
	 * 支出总计
	 */
	@ApiField("total_payout")
	private String totalPayout;

	/** 
	 * 提前收款额度
	 */
	@ApiField("tqsk_loan")
	private String tqskLoan;

	/** 
	 * 余利宝收益
	 */
	@ApiField("ylb_profit")
	private String ylbProfit;

	public void setCreditLoan(String creditLoan) {
		this.creditLoan = creditLoan;
	}
	public String getCreditLoan( ) {
		return this.creditLoan;
	}

	public void setSaleRefund(String saleRefund) {
		this.saleRefund = saleRefund;
	}
	public String getSaleRefund( ) {
		return this.saleRefund;
	}

	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getServiceCharge( ) {
		return this.serviceCharge;
	}

	public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}
	public String getTotalIncome( ) {
		return this.totalIncome;
	}

	public void setTotalPayout(String totalPayout) {
		this.totalPayout = totalPayout;
	}
	public String getTotalPayout( ) {
		return this.totalPayout;
	}

	public void setTqskLoan(String tqskLoan) {
		this.tqskLoan = tqskLoan;
	}
	public String getTqskLoan( ) {
		return this.tqskLoan;
	}

	public void setYlbProfit(String ylbProfit) {
		this.ylbProfit = ylbProfit;
	}
	public String getYlbProfit( ) {
		return this.ylbProfit;
	}

}
