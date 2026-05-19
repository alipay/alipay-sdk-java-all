package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceMerchantItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoiceresult.consume.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-28 15:27:43
 */
public class AlipayCommerceEcInvoiceresultConsumeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262844682627293739L;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

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
	 * 开票失败原因
	 */
	@ApiField("fail_message")
	private String failMessage;

	/** 
	 * 发票总金额（单位：元）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票不含税金额（单位：元）
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/** 
	 * 开票申请id
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	/** 
	 * 开票时间
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/** 
	 * null
	 */
	@ApiListField("invoice_item_list")
	@ApiField("invoice_merchant_item")
	private List<InvoiceMerchantItem> invoiceItemList;

	/** 
	 * 发票票种
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/** 
	 * 红冲原因
	 */
	@ApiField("invoice_red_reason")
	private String invoiceRedReason;

	/** 
	 * 开票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/** 
	 * 发票税额（单位：元）
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/** 
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/** 
	 * 外部开票申请id，调用方自定义生成，且保证唯一
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	/** 
	 * 发票PDF格式文件地址
	 */
	@ApiField("pdf_file_url")
	private String pdfFileUrl;

	/** 
	 * 关联蓝票发票号码
	 */
	@ApiField("related_blue_invoice_no")
	private String relatedBlueInvoiceNo;

	/** 
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

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

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerAddress( ) {
		return this.buyerAddress;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getBuyerBankAccount( ) {
		return this.buyerBankAccount;
	}

	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public String getBuyerBankName( ) {
		return this.buyerBankName;
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

	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerTel( ) {
		return this.buyerTel;
	}

	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}
	public String getFailMessage( ) {
		return this.failMessage;
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

	public void setInvoiceApplyId(String invoiceApplyId) {
		this.invoiceApplyId = invoiceApplyId;
	}
	public String getInvoiceApplyId( ) {
		return this.invoiceApplyId;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceDate( ) {
		return this.invoiceDate;
	}

	public void setInvoiceItemList(List<InvoiceMerchantItem> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
	}
	public List<InvoiceMerchantItem> getInvoiceItemList( ) {
		return this.invoiceItemList;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind( ) {
		return this.invoiceKind;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

	public void setInvoiceRedReason(String invoiceRedReason) {
		this.invoiceRedReason = invoiceRedReason;
	}
	public String getInvoiceRedReason( ) {
		return this.invoiceRedReason;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getInvoiceStatus( ) {
		return this.invoiceStatus;
	}

	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}
	public String getInvoiceTaxAmount( ) {
		return this.invoiceTaxAmount;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType( ) {
		return this.invoiceType;
	}

	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
	}
	public String getOuterApplyId( ) {
		return this.outerApplyId;
	}

	public void setPdfFileUrl(String pdfFileUrl) {
		this.pdfFileUrl = pdfFileUrl;
	}
	public String getPdfFileUrl( ) {
		return this.pdfFileUrl;
	}

	public void setRelatedBlueInvoiceNo(String relatedBlueInvoiceNo) {
		this.relatedBlueInvoiceNo = relatedBlueInvoiceNo;
	}
	public String getRelatedBlueInvoiceNo( ) {
		return this.relatedBlueInvoiceNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
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

}
