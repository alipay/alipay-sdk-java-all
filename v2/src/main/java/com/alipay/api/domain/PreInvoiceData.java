package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预览发票数据
 *
 * @author auto create
 * @since 1.0, 2025-06-26 10:43:09
 */
public class PreInvoiceData extends AlipayObject {

	private static final long serialVersionUID = 2875947662129985468L;

	/**
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购买方开户行
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购买方开户行
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购买方抬头名称
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 购买方纳税识别号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购买方电话
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 价税合计-元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 价税合计币种
	 */
	@ApiField("invoice_amount_currency")
	private String invoiceAmountCurrency;

	/**
	 * 发票明细
	 */
	@ApiListField("invoice_details")
	@ApiField("invoice_detail")
	private List<InvoiceDetail> invoiceDetails;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 销售方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销售方账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 销售方抬头名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 销售方纳税识别号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销售方电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	public String getBuyerAddress() {
		return this.buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerBankAccount() {
		return this.buyerBankAccount;
	}
	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}

	public String getBuyerBankName() {
		return this.buyerBankName;
	}
	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}

	public String getBuyerInvoiceTitle() {
		return this.buyerInvoiceTitle;
	}
	public void setBuyerInvoiceTitle(String buyerInvoiceTitle) {
		this.buyerInvoiceTitle = buyerInvoiceTitle;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getBuyerTelephone() {
		return this.buyerTelephone;
	}
	public void setBuyerTelephone(String buyerTelephone) {
		this.buyerTelephone = buyerTelephone;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceAmountCurrency() {
		return this.invoiceAmountCurrency;
	}
	public void setInvoiceAmountCurrency(String invoiceAmountCurrency) {
		this.invoiceAmountCurrency = invoiceAmountCurrency;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return this.invoiceDetails;
	}
	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSellerAddress() {
		return this.sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerBankAccount() {
		return this.sellerBankAccount;
	}
	public void setSellerBankAccount(String sellerBankAccount) {
		this.sellerBankAccount = sellerBankAccount;
	}

	public String getSellerBankName() {
		return this.sellerBankName;
	}
	public void setSellerBankName(String sellerBankName) {
		this.sellerBankName = sellerBankName;
	}

	public String getSellerCompanyName() {
		return this.sellerCompanyName;
	}
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getSellerTelephone() {
		return this.sellerTelephone;
	}
	public void setSellerTelephone(String sellerTelephone) {
		this.sellerTelephone = sellerTelephone;
	}

}
