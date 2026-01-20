package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向订单发票明细
 *
 * @author auto create
 * @since 1.0, 2025-09-10 10:36:12
 */
public class OrderInvoice extends AlipayObject {

	private static final long serialVersionUID = 6317655633257268867L;

	/**
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购买方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购买方开户行
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购买方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购买方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购买方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/**
	 * 核验人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 开票员名称
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 开票员证件号码
	 */
	@ApiField("clerk_cert_no")
	private String clerkCertNo;

	/**
	 * 开票员证件类型
更多枚举详情见：
	 */
	@ApiField("clerk_cert_type")
	private String clerkCertType;

	/**
	 * 发票图片下载地址
	 */
	@ApiField("img_file_url")
	private String imgFileUrl;

	/**
	 * 发票含税金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票不含税金额（元，两位小数）
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票种类
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 开票状态信息
	 */
	@ApiField("invoice_status_message")
	private String invoiceStatusMessage;

	/**
	 * 发票税额（元，两位小数）
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 订单发票明细列表
	 */
	@ApiListField("order_invoice_item_list")
	@ApiField("order_invoice_item")
	private List<OrderInvoiceItem> orderInvoiceItemList;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 发票PDF下载地址
	 */
	@ApiField("pdf_file_url")
	private String pdfFileUrl;

	/**
	 * 销售方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销售方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 销售方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销售方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销售方电话
	 */
	@ApiField("seller_tel")
	private String sellerTel;

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

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getBuyerTel() {
		return this.buyerTel;
	}
	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}

	public String getChecker() {
		return this.checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getClerk() {
		return this.clerk;
	}
	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getClerkCertNo() {
		return this.clerkCertNo;
	}
	public void setClerkCertNo(String clerkCertNo) {
		this.clerkCertNo = clerkCertNo;
	}

	public String getClerkCertType() {
		return this.clerkCertType;
	}
	public void setClerkCertType(String clerkCertType) {
		this.clerkCertType = clerkCertType;
	}

	public String getImgFileUrl() {
		return this.imgFileUrl;
	}
	public void setImgFileUrl(String imgFileUrl) {
		this.imgFileUrl = imgFileUrl;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceAmountWithoutTax() {
		return this.invoiceAmountWithoutTax;
	}
	public void setInvoiceAmountWithoutTax(String invoiceAmountWithoutTax) {
		this.invoiceAmountWithoutTax = invoiceAmountWithoutTax;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
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

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceStatusMessage() {
		return this.invoiceStatusMessage;
	}
	public void setInvoiceStatusMessage(String invoiceStatusMessage) {
		this.invoiceStatusMessage = invoiceStatusMessage;
	}

	public String getInvoiceTaxAmount() {
		return this.invoiceTaxAmount;
	}
	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public List<OrderInvoiceItem> getOrderInvoiceItemList() {
		return this.orderInvoiceItemList;
	}
	public void setOrderInvoiceItemList(List<OrderInvoiceItem> orderInvoiceItemList) {
		this.orderInvoiceItemList = orderInvoiceItemList;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPdfFileUrl() {
		return this.pdfFileUrl;
	}
	public void setPdfFileUrl(String pdfFileUrl) {
		this.pdfFileUrl = pdfFileUrl;
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

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getSellerTel() {
		return this.sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}

}
