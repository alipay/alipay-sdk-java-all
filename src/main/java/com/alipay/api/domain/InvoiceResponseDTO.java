package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票结果
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:47
 */
public class InvoiceResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 2633585191881859763L;

	/**
	 * 不含税金额
	 */
	@ApiField("exclude_tax_invoice_amt")
	private MultiCurrencyMoneyOpenApi excludeTaxInvoiceAmt;

	/**
	 * 票面含税金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 收票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_rcv_date")
	private String invoiceRcvDate;

	/**
	 * 01 发票已提交;02 审核中(已收票);03 已审核;04 已驳回;05 已认证;06 已撤回
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * * 01,增值税专用发票; * 02,增值税普通发票; * 04,国际形式发票; * 05,其它发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 发票种类名称
	 */
	@ApiField("invoice_type_name")
	private String invoiceTypeName;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public MultiCurrencyMoneyOpenApi getExcludeTaxInvoiceAmt() {
		return this.excludeTaxInvoiceAmt;
	}
	public void setExcludeTaxInvoiceAmt(MultiCurrencyMoneyOpenApi excludeTaxInvoiceAmt) {
		this.excludeTaxInvoiceAmt = excludeTaxInvoiceAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
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

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceRcvDate() {
		return this.invoiceRcvDate;
	}
	public void setInvoiceRcvDate(String invoiceRcvDate) {
		this.invoiceRcvDate = invoiceRcvDate;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeName() {
		return this.invoiceTypeName;
	}
	public void setInvoiceTypeName(String invoiceTypeName) {
		this.invoiceTypeName = invoiceTypeName;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
