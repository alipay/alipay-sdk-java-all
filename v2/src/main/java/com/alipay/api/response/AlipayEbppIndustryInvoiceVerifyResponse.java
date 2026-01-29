package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.invoice.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-24 14:32:42
 */
public class AlipayEbppIndustryInvoiceVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4193958228456973725L;

	/** 
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/** 
	 * 购买方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/** 
	 * 购买方统一信用代码，如果是个人开票不存在该字段
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/** 
	 * 发票金额，单位元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票金额，不含税，单位元
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/** 
	 * 发票类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/** 
	 * 发票税额，单位元
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/** 
	 * 销售方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/** 
	 * 销售方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/** 
	 * 销售方统一信用代码
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/** 
	 * 发票验证结果码
	 */
	@ApiField("verify_result_code")
	private String verifyResultCode;

	/** 
	 * 校验错误/不通过时参考此信息
	 */
	@ApiField("verify_result_desc")
	private String verifyResultDesc;

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerAddress( ) {
		return this.buyerAddress;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerName( ) {
		return this.buyerName;
	}

	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}
	public String getBuyerTaxNo( ) {
		return this.buyerTaxNo;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setInvoiceAmountWithoutTax(String invoiceAmountWithoutTax) {
		this.invoiceAmountWithoutTax = invoiceAmountWithoutTax;
	}
	public String getInvoiceAmountWithoutTax( ) {
		return this.invoiceAmountWithoutTax;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind( ) {
		return this.invoiceKind;
	}

	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}
	public String getInvoiceTaxAmount( ) {
		return this.invoiceTaxAmount;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerAddress( ) {
		return this.sellerAddress;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerName( ) {
		return this.sellerName;
	}

	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}
	public String getSellerTaxNo( ) {
		return this.sellerTaxNo;
	}

	public void setVerifyResultCode(String verifyResultCode) {
		this.verifyResultCode = verifyResultCode;
	}
	public String getVerifyResultCode( ) {
		return this.verifyResultCode;
	}

	public void setVerifyResultDesc(String verifyResultDesc) {
		this.verifyResultDesc = verifyResultDesc;
	}
	public String getVerifyResultDesc( ) {
		return this.verifyResultDesc;
	}

}
