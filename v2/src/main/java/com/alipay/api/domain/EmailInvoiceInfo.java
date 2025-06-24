package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 邮箱收票发票模型
 *
 * @author auto create
 * @since 1.0, 2024-03-26 21:28:49
 */
public class EmailInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7845521224823612539L;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 开票员
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 发票版式文件类型
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 发票版式文件下载地址
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 财政电子票据子类型
	 */
	@ApiField("financial_electronic_type")
	private String financialElectronicType;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票明细项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_open_model")
	private List<InvoiceItemOpenModel> invoiceContent;

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
	 * 票面上备注信息
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private InvoiceTitleOpenModel invoiceTitle;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 原始发票代码
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 原始发票号码
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 销售方地址电话信息
	 */
	@ApiField("payee_address_tel")
	private String payeeAddressTel;

	/**
	 * 销售方开户行及账号
	 */
	@ApiField("payee_bank_name_account")
	private String payeeBankNameAccount;

	/**
	 * 销售方企业名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 销售方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 价税合计
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 合计税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 交易凭证文件下载链接
	 */
	@ApiField("trade_file_download_url")
	private String tradeFileDownloadUrl;

	/**
	 * 交易凭证文件类型
	 */
	@ApiField("trade_file_type")
	private String tradeFileType;

	/**
	 * 数电票xml板式文件下载地址
	 */
	@ApiField("xml_file_download_url")
	private String xmlFileDownloadUrl;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
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

	public String getExTaxAmount() {
		return this.exTaxAmount;
	}
	public void setExTaxAmount(String exTaxAmount) {
		this.exTaxAmount = exTaxAmount;
	}

	public String getFileDownloadType() {
		return this.fileDownloadType;
	}
	public void setFileDownloadType(String fileDownloadType) {
		this.fileDownloadType = fileDownloadType;
	}

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFinancialElectronicType() {
		return this.financialElectronicType;
	}
	public void setFinancialElectronicType(String financialElectronicType) {
		this.financialElectronicType = financialElectronicType;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public List<InvoiceItemOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(List<InvoiceItemOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
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

	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}
	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public InvoiceTitleOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(InvoiceTitleOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOriBlueInvCode() {
		return this.oriBlueInvCode;
	}
	public void setOriBlueInvCode(String oriBlueInvCode) {
		this.oriBlueInvCode = oriBlueInvCode;
	}

	public String getOriBlueInvNo() {
		return this.oriBlueInvNo;
	}
	public void setOriBlueInvNo(String oriBlueInvNo) {
		this.oriBlueInvNo = oriBlueInvNo;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPayeeAddressTel() {
		return this.payeeAddressTel;
	}
	public void setPayeeAddressTel(String payeeAddressTel) {
		this.payeeAddressTel = payeeAddressTel;
	}

	public String getPayeeBankNameAccount() {
		return this.payeeBankNameAccount;
	}
	public void setPayeeBankNameAccount(String payeeBankNameAccount) {
		this.payeeBankNameAccount = payeeBankNameAccount;
	}

	public String getPayeeRegisterName() {
		return this.payeeRegisterName;
	}
	public void setPayeeRegisterName(String payeeRegisterName) {
		this.payeeRegisterName = payeeRegisterName;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getSumAmount() {
		return this.sumAmount;
	}
	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTradeFileDownloadUrl() {
		return this.tradeFileDownloadUrl;
	}
	public void setTradeFileDownloadUrl(String tradeFileDownloadUrl) {
		this.tradeFileDownloadUrl = tradeFileDownloadUrl;
	}

	public String getTradeFileType() {
		return this.tradeFileType;
	}
	public void setTradeFileType(String tradeFileType) {
		this.tradeFileType = tradeFileType;
	}

	public String getXmlFileDownloadUrl() {
		return this.xmlFileDownloadUrl;
	}
	public void setXmlFileDownloadUrl(String xmlFileDownloadUrl) {
		this.xmlFileDownloadUrl = xmlFileDownloadUrl;
	}

}
