package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单张报销发票数据
 *
 * @author auto create
 * @since 1.0, 2025-06-19 17:29:23
 */
public class ReimburseInvoice extends AlipayObject {

	private static final long serialVersionUID = 2816779758554747865L;

	/**
	 * 发票代码，数电票中没有发票代码。传统税控票中发票代码通常12位
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码，不可为空。通常传统税控票通常发票号码为8位，数电票发票号码为20位
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

}
