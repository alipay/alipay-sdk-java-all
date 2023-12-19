package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预览发票后，编辑发票内容后提交开票请求
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:43:03
 */
public class OpenApiOutputInvoicePreviewedOrder extends AlipayObject {

	private static final long serialVersionUID = 2849563319166228222L;

	/**
	 * 发票购方公司的注册地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 发票购方的开户行银行账号信息
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 发票购方的公司开户行银行名称
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 发票购方的公司名称
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 购方PID
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 发票购方的MID
	 */
	@ApiField("buyer_mid")
	private String buyerMid;

	/**
	 * 发票购方的税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 发票购方公司的联系电话信息
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 发票的开票人信息
	 */
	@ApiField("drawer")
	private String drawer;

	/**
	 * 发票全电标识
	 */
	@ApiField("full_electronic_tag")
	private String fullElectronicTag;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 开票渠道，线上开具 or 线下开具
	 */
	@ApiField("invoice_channel")
	private String invoiceChannel;

	/**
	 * 发票代码，发票上标注发票代码的字段
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票的开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票id，发票在发票表里的唯一标识
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票对应的发票行信息
	 */
	@ApiListField("invoice_lines")
	@ApiField("open_api_invoice_line_previewed_order")
	private List<OpenApiInvoiceLinePreviewedOrder> invoiceLines;

	/**
	 * 发票的介质，电子/纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码，发票上面标注号码的字段
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票上的票面备注信息
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 发票状态，预览后申请开票的发票，状态只会为待开票（01）
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票类型，增值税专用发票/增值税普通发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 该发票能在在线开票
	 */
	@ApiField("is_online")
	private String isOnline;

	/**
	 * 发票是红票还是蓝票，Y：红票，N：蓝票
	 */
	@ApiField("is_red")
	private String isRed;

	/**
	 * 发票邮寄状态，预览后申请开票的发票邮寄状态只会为待邮寄（01）
	 */
	@ApiField("mail_status")
	private String mailStatus;

	/**
	 * 开票的备注，区别去票面备注，该字段用于指明开票原因等信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 该发票是否通过无账单开票生成
	 */
	@ApiField("no_bill_invoice_flag")
	private String noBillInvoiceFlag;

	/**
	 * 发票对应的收款人信息
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 发票对应的，最近一次的邮寄信息id
	 */
	@ApiField("recent_mail_id")
	private String recentMailId;

	/**
	 * 发票的红冲金额
	 */
	@ApiField("red_amt")
	private MultiCurrencyMoneyOpenApi redAmt;

	/**
	 * 发票的复核人名字
	 */
	@ApiField("reviewer")
	private String reviewer;

	/**
	 * 销方公司注册地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销方银行账号信息
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销方开户行名称
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 描述发票的销方公司名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 发票销方对应的OU编码
	 */
	@ApiField("seller_inst_id")
	private String sellerInstId;

	/**
	 * 销方公司的税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销方公司注册电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	/**
	 * 发票税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 发票类型，该接口传入的类型只会为OUTPUT（销项票）
	 */
	@ApiField("type")
	private String type;

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

	public String getBuyerIpRoleId() {
		return this.buyerIpRoleId;
	}
	public void setBuyerIpRoleId(String buyerIpRoleId) {
		this.buyerIpRoleId = buyerIpRoleId;
	}

	public String getBuyerMid() {
		return this.buyerMid;
	}
	public void setBuyerMid(String buyerMid) {
		this.buyerMid = buyerMid;
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

	public String getDrawer() {
		return this.drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	public String getFullElectronicTag() {
		return this.fullElectronicTag;
	}
	public void setFullElectronicTag(String fullElectronicTag) {
		this.fullElectronicTag = fullElectronicTag;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceChannel() {
		return this.invoiceChannel;
	}
	public void setInvoiceChannel(String invoiceChannel) {
		this.invoiceChannel = invoiceChannel;
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

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public List<OpenApiInvoiceLinePreviewedOrder> getInvoiceLines() {
		return this.invoiceLines;
	}
	public void setInvoiceLines(List<OpenApiInvoiceLinePreviewedOrder> invoiceLines) {
		this.invoiceLines = invoiceLines;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIsOnline() {
		return this.isOnline;
	}
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getIsRed() {
		return this.isRed;
	}
	public void setIsRed(String isRed) {
		this.isRed = isRed;
	}

	public String getMailStatus() {
		return this.mailStatus;
	}
	public void setMailStatus(String mailStatus) {
		this.mailStatus = mailStatus;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNoBillInvoiceFlag() {
		return this.noBillInvoiceFlag;
	}
	public void setNoBillInvoiceFlag(String noBillInvoiceFlag) {
		this.noBillInvoiceFlag = noBillInvoiceFlag;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getRecentMailId() {
		return this.recentMailId;
	}
	public void setRecentMailId(String recentMailId) {
		this.recentMailId = recentMailId;
	}

	public MultiCurrencyMoneyOpenApi getRedAmt() {
		return this.redAmt;
	}
	public void setRedAmt(MultiCurrencyMoneyOpenApi redAmt) {
		this.redAmt = redAmt;
	}

	public String getReviewer() {
		return this.reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
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

	public String getSellerInstId() {
		return this.sellerInstId;
	}
	public void setSellerInstId(String sellerInstId) {
		this.sellerInstId = sellerInstId;
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

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
