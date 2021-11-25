package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付发票关联DTO
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:36
 */
public class InputInvoiceBillLinkOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 7451715485424958411L;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 关联金额
	 */
	@ApiField("relate_amount")
	private MultiCurrencyMoneyOpenApi relateAmount;

	/**
	 * 关联到账单上的税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public MultiCurrencyMoneyOpenApi getRelateAmount() {
		return this.relateAmount;
	}
	public void setRelateAmount(MultiCurrencyMoneyOpenApi relateAmount) {
		this.relateAmount = relateAmount;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

}
