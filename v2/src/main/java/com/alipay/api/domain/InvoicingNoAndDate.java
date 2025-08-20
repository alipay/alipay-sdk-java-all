package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票号和日期
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class InvoicingNoAndDate extends AlipayObject {

	private static final long serialVersionUID = 7883273856588257467L;

	/**
	 * 发票号
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 开票日期
	 */
	@ApiField("invoicing_date")
	private Date invoicingDate;

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getInvoicingDate() {
		return this.invoicingDate;
	}
	public void setInvoicingDate(Date invoicingDate) {
		this.invoicingDate = invoicingDate;
	}

}
