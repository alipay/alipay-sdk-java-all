package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceItemContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.detail.output.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-25 13:07:03
 */
public class AlipayEbppInvoiceDetailOutputQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2134893152381444318L;

	/** 
	 * 防伪码，发票校验码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/** 
	 * 不含税金额（废弃），单位元
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/** 
	 * 发票报销状态
取值范围：
WAIT_EXPENSE－未报销
EXPENSE_PROCESSING－报销中
EXPENSE_FINISHED－已报销
	 */
	@ApiField("expense_status")
	private String expenseStatus;

	/** 
	 * 该发票可能存在异常，请核实后使用
true:无异常
false:存在异常
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 是否已上传发票pdf文件
false－未上传
true－已上传
	 */
	@ApiField("has_upload_pdf")
	private String hasUploadPdf;

	/** 
	 * 发票金额（价税合计金额），单位元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票代码
（全电票为空）
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/** 
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/** 
	 * 发票缩略图地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/** 
	 * 发票内容项
	 */
	@ApiListField("invoice_item_content_list")
	@ApiField("invoice_item_content")
	private List<InvoiceItemContent> invoiceItemContentList;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/** 
	 * 发票状态
SUCCEED－成功
EXPIRED－已失效
TRANSFERRED－已转交
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/** 
	 * 发票类型
值有两种情况：blue－蓝票 red－红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/** 
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/** 
	 * 销售方开户银行账号
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/** 
	 * 销售方开户银行名称
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/** 
	 * 销售方电话
	 */
	@ApiField("payee_phone")
	private String payeePhone;

	/** 
	 * 销售方名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/** 
	 * 销售方税号
	 */
	@ApiField("payee_tax_no")
	private String payeeTaxNo;

	/** 
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/** 
	 * 购买方开户银行账号
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/** 
	 * 购买方开户银行名称
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/** 
	 * 购买方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/** 
	 * 购买方电话
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/** 
	 * 购买方税号
	 */
	@ApiField("payer_tax_no")
	private String payerTaxNo;

	/** 
	 * 合计税额（废弃）
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/** 
	 * 票种
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
ALL_ELECTRONIC_GENERAL：电子发票（普通发票）
ALL_ELECTRONIC_SPECIAL：电子发票（增值税专用发票）
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiField("tax_type")
	private String taxType;

	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}
	public String getAntiFakeCode( ) {
		return this.antiFakeCode;
	}

	public void setExTaxAmount(String exTaxAmount) {
		this.exTaxAmount = exTaxAmount;
	}
	public String getExTaxAmount( ) {
		return this.exTaxAmount;
	}

	public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}
	public String getExpenseStatus( ) {
		return this.expenseStatus;
	}

	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}
	public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

	public void setHasUploadPdf(String hasUploadPdf) {
		this.hasUploadPdf = hasUploadPdf;
	}
	public String getHasUploadPdf( ) {
		return this.hasUploadPdf;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceDate( ) {
		return this.invoiceDate;
	}

	public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}
	public String getInvoiceImgUrl( ) {
		return this.invoiceImgUrl;
	}

	public void setInvoiceItemContentList(List<InvoiceItemContent> invoiceItemContentList) {
		this.invoiceItemContentList = invoiceItemContentList;
	}
	public List<InvoiceItemContent> getInvoiceItemContentList( ) {
		return this.invoiceItemContentList;
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

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType( ) {
		return this.invoiceType;
	}

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}
	public String getPayeeAddress( ) {
		return this.payeeAddress;
	}

	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}
	public String getPayeeBankAccount( ) {
		return this.payeeBankAccount;
	}

	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeBankName( ) {
		return this.payeeBankName;
	}

	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}
	public String getPayeePhone( ) {
		return this.payeePhone;
	}

	public void setPayeeRegisterName(String payeeRegisterName) {
		this.payeeRegisterName = payeeRegisterName;
	}
	public String getPayeeRegisterName( ) {
		return this.payeeRegisterName;
	}

	public void setPayeeTaxNo(String payeeTaxNo) {
		this.payeeTaxNo = payeeTaxNo;
	}
	public String getPayeeTaxNo( ) {
		return this.payeeTaxNo;
	}

	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}
	public String getPayerAddress( ) {
		return this.payerAddress;
	}

	public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}
	public String getPayerBankAccount( ) {
		return this.payerBankAccount;
	}

	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}
	public String getPayerBankName( ) {
		return this.payerBankName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerName( ) {
		return this.payerName;
	}

	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}
	public String getPayerPhone( ) {
		return this.payerPhone;
	}

	public void setPayerTaxNo(String payerTaxNo) {
		this.payerTaxNo = payerTaxNo;
	}
	public String getPayerTaxNo( ) {
		return this.payerTaxNo;
	}

	public void setSumTaxAmount(String sumTaxAmount) {
		this.sumTaxAmount = sumTaxAmount;
	}
	public String getSumTaxAmount( ) {
		return this.sumTaxAmount;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTaxType( ) {
		return this.taxType;
	}

}
