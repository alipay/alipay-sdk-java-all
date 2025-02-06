package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票同步验真入参
 *
 * @author auto create
 * @since 1.0, 2023-09-11 19:47:14
 */
public class InvoiceSyncCheckDTO extends AlipayObject {

	private static final long serialVersionUID = 7541476836683735776L;

	/**
	 * ou代码
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 校验码,专票传空
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * Y:全电票,N:非全电票
	 */
	@ApiField("full_electronic_flag")
	private String fullElectronicFlag;

	/**
	 * 价税合计,单位元,两位小数
	 */
	@ApiField("invoice_amt")
	private String invoiceAmt;

	/**
	 * 发票代码，全电票传空
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期，格式yyyyMMdd
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 税额,单位元,两位小数
	 */
	@ApiField("tax_amt")
	private String taxAmt;

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFullElectronicFlag() {
		return this.fullElectronicFlag;
	}
	public void setFullElectronicFlag(String fullElectronicFlag) {
		this.fullElectronicFlag = fullElectronicFlag;
	}

	public String getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(String invoiceAmt) {
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

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

}
