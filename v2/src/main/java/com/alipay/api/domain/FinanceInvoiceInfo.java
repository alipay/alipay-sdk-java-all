package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的标准发票信息
 *
 * @author auto create
 * @since 1.0, 2020-04-02 21:22:23
 */
public class FinanceInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 4344675463397699369L;

	/**
	 * 发票金额（不含税），以元为单位的，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发票金额（含税）
	 */
	@ApiField("amount_with_tax")
	private String amountWithTax;

	/**
	 * UTC标准格式
	 */
	@ApiField("billing_date")
	private String billingDate;

	/**
	 * 发票验证码后6位
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 发票对应合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 发票影印件信息
	 */
	@ApiField("file")
	private FinanceFileInfo file;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_number")
	private String invoiceNumber;

	/**
	 * 发票类型:专票SPECIAL,普票REGULAR,电票DIGITAL
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountWithTax() {
		return this.amountWithTax;
	}
	public void setAmountWithTax(String amountWithTax) {
		this.amountWithTax = amountWithTax;
	}

	public String getBillingDate() {
		return this.billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public FinanceFileInfo getFile() {
		return this.file;
	}
	public void setFile(FinanceFileInfo file) {
		this.file = file;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

}
