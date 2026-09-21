package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝交易同步发票场景下的发票入参模型
 *
 * @author auto create
 * @since 1.0, 2026-09-17 13:38:06
 */
public class InvoiceSendOpenByAlipayTradeNo extends AlipayObject {

	private static final long serialVersionUID = 5575198793858335121L;

	/**
	 * 票面上的校验码信息。
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 票面上复核人信息。
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 票面上开票员信息。
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额，票面上的不含税金额，单位（元），保留两位小数。
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 预留的扩展字段，格式如：key1=value1\nkey2=value2\nkey3=value3，字段之间以\n分隔。
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 下载版式文件类型，需要回传文件下载链接的情况下必传
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 发票版式文件下载地址。
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 财政电子票据子类型
	 */
	@ApiField("financial_electronic_type")
	private String financialElectronicType;

	/**
	 * 发票代码，该字段与invoice_no构成一张发票的唯一标识。
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
	 * 开票日期，格式如：YYYY-MM-DD。
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 标识发票的类型， PLAIN:增值税电子普通发票; SPECIAL:增值税专用发票; ALL_ELECTRONIC_GENERAL:电子发票（普通发票）; ALL_ELECTRONIC_SPECIAL:电子发票（增值税专用发票）; PLAIN_INVOICE:增值税普通发票; FINANCIAL_ELECTRONIC_BILL:财政电子票据;
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 票面上备注信息。
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票号码，该字段与invoice_code构成一张发票的唯一标识。
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private InvoiceTitleOpenModel invoiceTitle;

	/**
	 * 标识是红票还是蓝票，RED:红票;BLUE:蓝票。
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 红票情况下，必须填入原始蓝票的发票代码（全电票时为空）。
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 红票情况下，必须填入原始蓝票的发票号码。
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 外部发票id，isv生成发票之后所生成的发票流水号，主要用做存储。
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 外部商户交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 票面上收款人信息。
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 票面上销售方地址、电话信息。
	 */
	@ApiField("payee_address_tel")
	private String payeeAddressTel;

	/**
	 * 票面上销售方开户行及账号。
	 */
	@ApiField("payee_bank_name_account")
	private String payeeBankNameAccount;

	/**
	 * 票面上销售方企业名称。
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 票面上销售方税号信息。
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 价税合计，票面上的总开票金额，单位（元），保留两位小数，sum_amount=ex_tax_amount+tax_amount。
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 合计税额，票面上的合计税额，单位（元），保留两位小数。
	 */
	@ApiField("tax_amount")
	private String taxAmount;

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

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
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

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
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

	public String getOutInvoiceId() {
		return this.outInvoiceId;
	}
	public void setOutInvoiceId(String outInvoiceId) {
		this.outInvoiceId = outInvoiceId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

}
