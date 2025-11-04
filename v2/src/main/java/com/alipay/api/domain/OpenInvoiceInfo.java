package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票信息模型
 *
 * @author auto create
 * @since 1.0, 2023-09-14 19:37:56
 */
public class OpenInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 2484316271692478368L;

	/**
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 购方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购方开户行
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

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
	 * 开票人
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 原始文件/板式文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 发票图片预览地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 不含税开票金额
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票明细列表
	 */
	@ApiListField("invoice_item_list")
	@ApiField("open_invoice_item")
	private List<OpenInvoiceItem> invoiceItemList;

	/**
	 * 发票介质类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票标签
	 */
	@ApiField("invoice_tag")
	private String invoiceTag;

	/**
	 * 税额
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/**
	 * 发票税率
	 */
	@ApiField("invoice_tax_rate")
	private String invoiceTaxRate;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 机器编码
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 原发票代码
	 */
	@ApiField("original_invoice_code")
	private String originalInvoiceCode;

	/**
	 * 原发票号码
	 */
	@ApiField("original_invoice_no")
	private String originalInvoiceNo;

	/**
	 * 密码区
	 */
	@ApiField("password_area")
	private String passwordArea;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 二维码值
	 */
	@ApiField("qr_code_text")
	private String qrCodeText;

	/**
	 * 冲红备注
	 */
	@ApiField("red_remarks")
	private String redRemarks;

	/**
	 * 销方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销方开户行
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 销方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销方电话
	 */
	@ApiField("seller_tel")
	private String sellerTel;

	/**
	 * 行程信息列表
	 */
	@ApiListField("travel_info_list")
	@ApiField("open_invoice_travel_info")
	private List<OpenInvoiceTravelInfo> travelInfoList;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

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

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public List<OpenInvoiceItem> getInvoiceItemList() {
		return this.invoiceItemList;
	}
	public void setInvoiceItemList(List<OpenInvoiceItem> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
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

	public String getInvoiceTag() {
		return this.invoiceTag;
	}
	public void setInvoiceTag(String invoiceTag) {
		this.invoiceTag = invoiceTag;
	}

	public String getInvoiceTaxAmount() {
		return this.invoiceTaxAmount;
	}
	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}

	public String getInvoiceTaxRate() {
		return this.invoiceTaxRate;
	}
	public void setInvoiceTaxRate(String invoiceTaxRate) {
		this.invoiceTaxRate = invoiceTaxRate;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getOriginalInvoiceCode() {
		return this.originalInvoiceCode;
	}
	public void setOriginalInvoiceCode(String originalInvoiceCode) {
		this.originalInvoiceCode = originalInvoiceCode;
	}

	public String getOriginalInvoiceNo() {
		return this.originalInvoiceNo;
	}
	public void setOriginalInvoiceNo(String originalInvoiceNo) {
		this.originalInvoiceNo = originalInvoiceNo;
	}

	public String getPasswordArea() {
		return this.passwordArea;
	}
	public void setPasswordArea(String passwordArea) {
		this.passwordArea = passwordArea;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getQrCodeText() {
		return this.qrCodeText;
	}
	public void setQrCodeText(String qrCodeText) {
		this.qrCodeText = qrCodeText;
	}

	public String getRedRemarks() {
		return this.redRemarks;
	}
	public void setRedRemarks(String redRemarks) {
		this.redRemarks = redRemarks;
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

	public List<OpenInvoiceTravelInfo> getTravelInfoList() {
		return this.travelInfoList;
	}
	public void setTravelInfoList(List<OpenInvoiceTravelInfo> travelInfoList) {
		this.travelInfoList = travelInfoList;
	}

}
