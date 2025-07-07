package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndustryInvoiceItemInfoQueryRes;
import com.alipay.api.domain.IndustryInvoiceRealPropertyBusiness;
import com.alipay.api.domain.IndustryInvoiceTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.invoiceapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 18:22:28
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8453792721324393275L;

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
	 * 购买方证件类型对应税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/** 
	 * 购买方证件类型
	 */
	@ApiField("buyer_tax_no_type")
	private String buyerTaxNoType;

	/** 
	 * 购买方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/** 
	 * 发票文件地址-图片
	 */
	@ApiField("img_file_url")
	private String imgFileUrl;

	/** 
	 * 发票总金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票不含税金额
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/** 
	 * 开票申请ID
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	/** 
	 * 开票异常错误码
	 */
	@ApiField("invoice_fail_code")
	private String invoiceFailCode;

	/** 
	 * 开票异常错误说明
	 */
	@ApiField("invoice_fail_desc")
	private String invoiceFailDesc;

	/** 
	 * 商品明细列表
	 */
	@ApiListField("invoice_item_list")
	@ApiField("industry_invoice_item_info_query_res")
	private List<IndustryInvoiceItemInfoQueryRes> invoiceItemList;

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
	 * 开票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/** 
	 * 发票税额
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/** 
	 * 外部开票申请ID
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	/** 
	 * 发票文件地址_PDF
	 */
	@ApiField("pdf_file_url")
	private String pdfFileUrl;

	/** 
	 * 发票产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 不动产信息列表
	 */
	@ApiListField("real_property_business_list")
	@ApiField("industry_invoice_real_property_business")
	private List<IndustryInvoiceRealPropertyBusiness> realPropertyBusinessList;

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
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/** 
	 * 交易信息列表
	 */
	@ApiListField("trade_list")
	@ApiField("industry_invoice_trade_info")
	private List<IndustryInvoiceTradeInfo> tradeList;

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

	public void setBuyerTaxNoType(String buyerTaxNoType) {
		this.buyerTaxNoType = buyerTaxNoType;
	}
	public String getBuyerTaxNoType( ) {
		return this.buyerTaxNoType;
	}

	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerTel( ) {
		return this.buyerTel;
	}

	public void setImgFileUrl(String imgFileUrl) {
		this.imgFileUrl = imgFileUrl;
	}
	public String getImgFileUrl( ) {
		return this.imgFileUrl;
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

	public void setInvoiceFailCode(String invoiceFailCode) {
		this.invoiceFailCode = invoiceFailCode;
	}
	public String getInvoiceFailCode( ) {
		return this.invoiceFailCode;
	}

	public void setInvoiceFailDesc(String invoiceFailDesc) {
		this.invoiceFailDesc = invoiceFailDesc;
	}
	public String getInvoiceFailDesc( ) {
		return this.invoiceFailDesc;
	}

	public void setInvoiceItemList(List<IndustryInvoiceItemInfoQueryRes> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
	}
	public List<IndustryInvoiceItemInfoQueryRes> getInvoiceItemList( ) {
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

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setRealPropertyBusinessList(List<IndustryInvoiceRealPropertyBusiness> realPropertyBusinessList) {
		this.realPropertyBusinessList = realPropertyBusinessList;
	}
	public List<IndustryInvoiceRealPropertyBusiness> getRealPropertyBusinessList( ) {
		return this.realPropertyBusinessList;
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

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

	public void setTradeList(List<IndustryInvoiceTradeInfo> tradeList) {
		this.tradeList = tradeList;
	}
	public List<IndustryInvoiceTradeInfo> getTradeList( ) {
		return this.tradeList;
	}

}
