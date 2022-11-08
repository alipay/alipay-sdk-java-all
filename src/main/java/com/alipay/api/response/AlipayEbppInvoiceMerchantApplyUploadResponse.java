package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.apply.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-22 09:59:00
 */
public class AlipayEbppInvoiceMerchantApplyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4683993734792348649L;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

}
