package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票VO对象
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:22:17
 */
public class OpenApiOutputInvoiceVO extends AlipayObject {

	private static final long serialVersionUID = 5821574236794974771L;

	/**
	 * 发票附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * 发票附件key
	 */
	@ApiField("attachment_oss_key")
	private String attachmentOssKey;

	/**
	 * 购方公司的地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购方银行名称
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购方开户行名称
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购方发票抬头
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 购方角色id
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 购方mid
	 */
	@ApiField("buyer_mid")
	private String buyerMid;

	/**
	 * 购方公司税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购方公司电话
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 是否可以关联账单 true：可以 false：不可以
	 */
	@ApiField("can_link")
	private Boolean canLink;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 开票人
	 */
	@ApiField("drawer")
	private String drawer;

	/**
	 * 电子发票文件地址
	 */
	@ApiField("elc_invoice_url")
	private String elcInvoiceUrl;

	/**
	 * 发票认证时间
	 */
	@ApiField("gmt_auth")
	private Date gmtAuth;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 发票关联时间
	 */
	@ApiField("gmt_relevant")
	private Date gmtRelevant;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 开票渠道 01 线上,02 线下
	 */
	@ApiField("invoice_channel")
	private String invoiceChannel;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票行列表
	 */
	@ApiListField("invoice_lines")
	@ApiField("open_api_invoice_line_v_o")
	private List<OpenApiInvoiceLineVO> invoiceLines;

	/**
	 * 发票介质 01 电子,02 纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票票面备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 发票状态 OutputInvoiceStatusEnum的code
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * com.alipay.gfinvoice.facade.enums.InvoiceTypeEnum的code
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 是否能在线开票 Y 能, N 不能
	 */
	@ApiField("is_online")
	private String isOnline;

	/**
	 * 是否红字 Y红字 N蓝字
	 */
	@ApiField("is_red")
	private String isRed;

	/**
	 * 最后一次操作人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 已关联账单金额，无账单发票后续关联账单有该值
	 */
	@ApiField("linked_amt")
	private MultiCurrencyMoneyOpenApi linkedAmt;

	/**
	 * 邮寄状态
	 */
	@ApiField("mail_status")
	private String mailStatus;

	/**
	 * 申请原因|申请备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否是无账单发票 Y：是  N：不是
	 */
	@ApiField("no_bill_invoice_flag")
	private String noBillInvoiceFlag;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 形式发票Html
	 */
	@ApiField("proforma_invoice_html")
	private String proformaInvoiceHtml;

	/**
	 * 最近一次邮寄ID
	 */
	@ApiField("recent_mail_id")
	private String recentMailId;

	/**
	 * 红冲金额
	 */
	@ApiField("red_amt")
	private MultiCurrencyMoneyOpenApi redAmt;

	/**
	 * 红冲税务通知单号
	 */
	@ApiField("red_notice_no")
	private String redNoticeNo;

	/**
	 * 复核人
	 */
	@ApiField("reviewer")
	private String reviewer;

	/**
	 * 销方注册地
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销方开户行名称
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 销方公司名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 销方机构id
	 */
	@ApiField("seller_inst_id")
	private String sellerInstId;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销方公司电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 形式发票模板url
	 */
	@ApiField("template_url")
	private String templateUrl;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentOssKey() {
		return this.attachmentOssKey;
	}
	public void setAttachmentOssKey(String attachmentOssKey) {
		this.attachmentOssKey = attachmentOssKey;
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

	public Boolean getCanLink() {
		return this.canLink;
	}
	public void setCanLink(Boolean canLink) {
		this.canLink = canLink;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDrawer() {
		return this.drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	public String getElcInvoiceUrl() {
		return this.elcInvoiceUrl;
	}
	public void setElcInvoiceUrl(String elcInvoiceUrl) {
		this.elcInvoiceUrl = elcInvoiceUrl;
	}

	public Date getGmtAuth() {
		return this.gmtAuth;
	}
	public void setGmtAuth(Date gmtAuth) {
		this.gmtAuth = gmtAuth;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtRelevant() {
		return this.gmtRelevant;
	}
	public void setGmtRelevant(Date gmtRelevant) {
		this.gmtRelevant = gmtRelevant;
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

	public List<OpenApiInvoiceLineVO> getInvoiceLines() {
		return this.invoiceLines;
	}
	public void setInvoiceLines(List<OpenApiInvoiceLineVO> invoiceLines) {
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

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public MultiCurrencyMoneyOpenApi getLinkedAmt() {
		return this.linkedAmt;
	}
	public void setLinkedAmt(MultiCurrencyMoneyOpenApi linkedAmt) {
		this.linkedAmt = linkedAmt;
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

	public String getProformaInvoiceHtml() {
		return this.proformaInvoiceHtml;
	}
	public void setProformaInvoiceHtml(String proformaInvoiceHtml) {
		this.proformaInvoiceHtml = proformaInvoiceHtml;
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

	public String getRedNoticeNo() {
		return this.redNoticeNo;
	}
	public void setRedNoticeNo(String redNoticeNo) {
		this.redNoticeNo = redNoticeNo;
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

	public String getTemplateUrl() {
		return this.templateUrl;
	}
	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
