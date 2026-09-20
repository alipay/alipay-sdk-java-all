package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请明细
 *
 * @author auto create
 * @since 1.0, 2026-09-18 17:33:06
 */
public class InvoiceApplyDetail extends AlipayObject {

	private static final long serialVersionUID = 6531794845832582112L;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务资金类型
	 */
	@ApiField("biz_fund_type")
	private String bizFundType;

	/**
	 * 外部商户交易号，来源于申请明细
	 */
	@ApiField("external_merchant_trade_no")
	private String externalMerchantTradeNo;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizFundType() {
		return this.bizFundType;
	}
	public void setBizFundType(String bizFundType) {
		this.bizFundType = bizFundType;
	}

	public String getExternalMerchantTradeNo() {
		return this.externalMerchantTradeNo;
	}
	public void setExternalMerchantTradeNo(String externalMerchantTradeNo) {
		this.externalMerchantTradeNo = externalMerchantTradeNo;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

}
