package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票详细信息
 *
 * @author auto create
 * @since 1.0, 2021-10-26 19:42:09
 */
public class CompleteVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4847926231276233439L;

	/**
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 校验码
	 */
	@ApiField("check_sum")
	private String checkSum;

	/**
	 * 开票机器码
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 板式文件下载地址
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 板式文件的类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 发票金额
	 */
	@ApiField("invoice_amount")
	private Long invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 汇总发票详细信息(目前该字段为空)
	 */
	@ApiListField("invoice_content_list")
	@ApiField("invoice_content_info")
	private List<InvoiceContentInfo> invoiceContentList;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票类型 0：增值税普通电子发票 1：增值税普通发票 2：增值税专用发票 3：增值税专用电子发票 4：财政电子发票
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * 备注
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
	private String invoiceTitle;

	/**
	 * 发票类型(红、蓝)
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销售方银行账号
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/**
	 * 销售方银行名称
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 复核人
	 */
	@ApiField("payee_checker")
	private String payeeChecker;

	/**
	 * 销售方电话
	 */
	@ApiField("payee_mobile")
	private String payeeMobile;

	/**
	 * 销售方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 开票人
	 */
	@ApiField("payee_operator")
	private String payeeOperator;

	/**
	 * 收款人
	 */
	@ApiField("payee_receiver")
	private String payeeReceiver;

	/**
	 * 销售方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 购买方银行账号
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/**
	 * 购买方银行名称
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购买方电话
	 */
	@ApiField("payer_mobile")
	private String payerMobile;

	/**
	 * 购买方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购买方税号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 不含税金额
	 */
	@ApiField("sum_price")
	private Long sumPrice;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax")
	private Long sumTax;

	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

	public String getCheckSum() {
		return this.checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(Long invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public List<InvoiceContentInfo> getInvoiceContentList() {
		return this.invoiceContentList;
	}
	public void setInvoiceContentList(List<InvoiceContentInfo> invoiceContentList) {
		this.invoiceContentList = invoiceContentList;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(Long invoiceKind) {
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

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeeBankAccount() {
		return this.payeeBankAccount;
	}
	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}

	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	public String getPayeeChecker() {
		return this.payeeChecker;
	}
	public void setPayeeChecker(String payeeChecker) {
		this.payeeChecker = payeeChecker;
	}

	public String getPayeeMobile() {
		return this.payeeMobile;
	}
	public void setPayeeMobile(String payeeMobile) {
		this.payeeMobile = payeeMobile;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeOperator() {
		return this.payeeOperator;
	}
	public void setPayeeOperator(String payeeOperator) {
		this.payeeOperator = payeeOperator;
	}

	public String getPayeeReceiver() {
		return this.payeeReceiver;
	}
	public void setPayeeReceiver(String payeeReceiver) {
		this.payeeReceiver = payeeReceiver;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerAddress() {
		return this.payerAddress;
	}
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerBankAccount() {
		return this.payerBankAccount;
	}
	public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}

	public String getPayerBankName() {
		return this.payerBankName;
	}
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	public String getPayerMobile() {
		return this.payerMobile;
	}
	public void setPayerMobile(String payerMobile) {
		this.payerMobile = payerMobile;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public Long getSumPrice() {
		return this.sumPrice;
	}
	public void setSumPrice(Long sumPrice) {
		this.sumPrice = sumPrice;
	}

	public Long getSumTax() {
		return this.sumTax;
	}
	public void setSumTax(Long sumTax) {
		this.sumTax = sumTax;
	}

}
