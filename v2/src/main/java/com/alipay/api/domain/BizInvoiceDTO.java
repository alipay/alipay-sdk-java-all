package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:51:49
 */
public class BizInvoiceDTO extends AlipayObject {

	private static final long serialVersionUID = 2542417879617932575L;

	/**
	 * 发票金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 不含税金额
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票编号
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 发票链接
	 */
	@ApiListField("invoice_urls")
	@ApiField("string")
	private List<String> invoiceUrls;

	/**
	 * 是否红票
	 */
	@ApiField("red")
	private Boolean red;

	/**
	 * 含税金额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public List<String> getInvoiceUrls() {
		return this.invoiceUrls;
	}
	public void setInvoiceUrls(List<String> invoiceUrls) {
		this.invoiceUrls = invoiceUrls;
	}

	public Boolean getRed() {
		return this.red;
	}
	public void setRed(Boolean red) {
		this.red = red;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
