package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票验真返回
 *
 * @author auto create
 * @since 1.0, 2023-09-11 19:47:48
 */
public class InputInvoiceCheckResponse extends AlipayObject {

	private static final long serialVersionUID = 6749832788882946617L;

	/**
	 * 购方地址电话
	 */
	@ApiField("buyer_address_phone")
	private String buyerAddressPhone;

	/**
	 * 购方银行信息
	 */
	@ApiField("buyer_bank_info")
	private String buyerBankInfo;

	/**
	 * 购方公司名称
	 */
	@ApiField("buyer_company_name")
	private String buyerCompanyName;

	/**
	 * 购方ouCode
	 */
	@ApiField("buyer_ou_code")
	private String buyerOuCode;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 作废标识
	 */
	@ApiField("cancellation_mark")
	private String cancellationMark;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 开票人
	 */
	@ApiField("drawer")
	private String drawer;

	/**
	 * Y:全电,N:非全电
	 */
	@ApiField("full_electronic_flag")
	private String fullElectronicFlag;

	/**
	 * 发票行
	 */
	@ApiListField("input_invoice_check_line")
	@ApiField("input_invoice_check_line")
	private List<InputInvoiceCheckLine> inputInvoiceCheckLine;

	/**
	 * 价税合计,单位元,两位小数
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
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
	 * 发票备注
	 */
	@ApiField("invoice_remark")
	private String invoiceRemark;

	/**
	 * 01:专票,02:普票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * ofd文件下载链接
	 */
	@ApiField("ofd_url")
	private String ofdUrl;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * pdf文件下载链接
	 */
	@ApiField("pdf_url")
	private String pdfUrl;

	/**
	 * 复核人
	 */
	@ApiField("reviewer")
	private String reviewer;

	/**
	 * 销方地址电话
	 */
	@ApiField("seller_address_phone")
	private String sellerAddressPhone;

	/**
	 * 销方银行信息
	 */
	@ApiField("seller_bank_info")
	private String sellerBankInfo;

	/**
	 * 销方名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 异步验真时返回任务id,通过该id获取验真结果
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 税额,单位元,两位小数
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	public String getBuyerAddressPhone() {
		return this.buyerAddressPhone;
	}
	public void setBuyerAddressPhone(String buyerAddressPhone) {
		this.buyerAddressPhone = buyerAddressPhone;
	}

	public String getBuyerBankInfo() {
		return this.buyerBankInfo;
	}
	public void setBuyerBankInfo(String buyerBankInfo) {
		this.buyerBankInfo = buyerBankInfo;
	}

	public String getBuyerCompanyName() {
		return this.buyerCompanyName;
	}
	public void setBuyerCompanyName(String buyerCompanyName) {
		this.buyerCompanyName = buyerCompanyName;
	}

	public String getBuyerOuCode() {
		return this.buyerOuCode;
	}
	public void setBuyerOuCode(String buyerOuCode) {
		this.buyerOuCode = buyerOuCode;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getCancellationMark() {
		return this.cancellationMark;
	}
	public void setCancellationMark(String cancellationMark) {
		this.cancellationMark = cancellationMark;
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

	public String getDrawer() {
		return this.drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	public String getFullElectronicFlag() {
		return this.fullElectronicFlag;
	}
	public void setFullElectronicFlag(String fullElectronicFlag) {
		this.fullElectronicFlag = fullElectronicFlag;
	}

	public List<InputInvoiceCheckLine> getInputInvoiceCheckLine() {
		return this.inputInvoiceCheckLine;
	}
	public void setInputInvoiceCheckLine(List<InputInvoiceCheckLine> inputInvoiceCheckLine) {
		this.inputInvoiceCheckLine = inputInvoiceCheckLine;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
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

	public String getInvoiceRemark() {
		return this.invoiceRemark;
	}
	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOfdUrl() {
		return this.ofdUrl;
	}
	public void setOfdUrl(String ofdUrl) {
		this.ofdUrl = ofdUrl;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPdfUrl() {
		return this.pdfUrl;
	}
	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getReviewer() {
		return this.reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getSellerAddressPhone() {
		return this.sellerAddressPhone;
	}
	public void setSellerAddressPhone(String sellerAddressPhone) {
		this.sellerAddressPhone = sellerAddressPhone;
	}

	public String getSellerBankInfo() {
		return this.sellerBankInfo;
	}
	public void setSellerBankInfo(String sellerBankInfo) {
		this.sellerBankInfo = sellerBankInfo;
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

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

}
