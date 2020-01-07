package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的标准发票信息
 *
 * @author auto create
 * @since 1.0, 2019-12-16 16:53:49
 */
public class FinanceInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 4334468749849383458L;

	/**
	 * 发票金额，以元为单位的，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

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

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

}
