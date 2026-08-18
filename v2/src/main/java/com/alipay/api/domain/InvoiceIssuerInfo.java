package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票人员信息，包含开票人、开票员证件、收款人和复核人
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceIssuerInfo extends AlipayObject {

	private static final long serialVersionUID = 6752833533711442215L;

	/**
	 * 收款人
	 */
	@ApiField("cashier_name")
	private String cashierName;

	/**
	 * 复核人
	 */
	@ApiField("checker_name")
	private String checkerName;

	/**
	 * 开票员证件号码
	 */
	@ApiField("invoice_clerk_certificate_no")
	private String invoiceClerkCertificateNo;

	/**
	 * 开票员证件类型.居民身份证201
	 */
	@ApiField("invoice_clerk_certificate_type")
	private String invoiceClerkCertificateType;

	/**
	 * 开票人或开票员
	 */
	@ApiField("invoice_issuer")
	private String invoiceIssuer;

	public String getCashierName() {
		return this.cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getCheckerName() {
		return this.checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}

	public String getInvoiceClerkCertificateNo() {
		return this.invoiceClerkCertificateNo;
	}
	public void setInvoiceClerkCertificateNo(String invoiceClerkCertificateNo) {
		this.invoiceClerkCertificateNo = invoiceClerkCertificateNo;
	}

	public String getInvoiceClerkCertificateType() {
		return this.invoiceClerkCertificateType;
	}
	public void setInvoiceClerkCertificateType(String invoiceClerkCertificateType) {
		this.invoiceClerkCertificateType = invoiceClerkCertificateType;
	}

	public String getInvoiceIssuer() {
		return this.invoiceIssuer;
	}
	public void setInvoiceIssuer(String invoiceIssuer) {
		this.invoiceIssuer = invoiceIssuer;
	}

}
