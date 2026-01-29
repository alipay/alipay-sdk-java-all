package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票信息核验
 *
 * @author auto create
 * @since 1.0, 2026-01-24 14:32:42
 */
public class AlipayEbppIndustryInvoiceVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5819869385533352452L;

	/**
	 * 校验码，20位数字：全电发票没有
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 发票金额，单位元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码，如无可空，全电发票没有
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期，格式为 yyyy-MM-dd
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

}
