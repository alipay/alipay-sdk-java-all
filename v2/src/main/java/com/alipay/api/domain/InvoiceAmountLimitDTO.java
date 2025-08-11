package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票限额信息
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:59:33
 */
public class InvoiceAmountLimitDTO extends AlipayObject {

	private static final long serialVersionUID = 3459546982675319377L;

	/**
	 * 单张发票限额
	 */
	@ApiField("amount_limit")
	private String amountLimit;

	/**
	 * 发票类型，可选值：电子发票：0，纸质普票：1，纸质专票：2
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * 月发票限额
	 */
	@ApiField("month_amount_limit")
	private String monthAmountLimit;

	public String getAmountLimit() {
		return this.amountLimit;
	}
	public void setAmountLimit(String amountLimit) {
		this.amountLimit = amountLimit;
	}

	public Long getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(Long invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getMonthAmountLimit() {
		return this.monthAmountLimit;
	}
	public void setMonthAmountLimit(String monthAmountLimit) {
		this.monthAmountLimit = monthAmountLimit;
	}

}
