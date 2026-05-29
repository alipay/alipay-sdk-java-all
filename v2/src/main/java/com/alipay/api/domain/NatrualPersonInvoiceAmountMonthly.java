package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自然人月开票金额信息
 *
 * @author auto create
 * @since 1.0, 2026-02-02 10:36:08
 */
public class NatrualPersonInvoiceAmountMonthly extends AlipayObject {

	private static final long serialVersionUID = 5363999511925759926L;

	/**
	 * 月累计开票总金额，单位：元
	 */
	@ApiField("invoice_total_amount_monthly")
	private String invoiceTotalAmountMonthly;

	/**
	 * 开票统计月份
	 */
	@ApiField("month")
	private String month;

	public String getInvoiceTotalAmountMonthly() {
		return this.invoiceTotalAmountMonthly;
	}
	public void setInvoiceTotalAmountMonthly(String invoiceTotalAmountMonthly) {
		this.invoiceTotalAmountMonthly = invoiceTotalAmountMonthly;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

}
