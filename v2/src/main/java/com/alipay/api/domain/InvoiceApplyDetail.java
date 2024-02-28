package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请明细
 *
 * @author auto create
 * @since 1.0, 2023-08-01 15:21:33
 */
public class InvoiceApplyDetail extends AlipayObject {

	private static final long serialVersionUID = 2663151713565784378L;

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

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

}
