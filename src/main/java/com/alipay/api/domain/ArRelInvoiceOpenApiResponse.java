package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票关联红蓝票信息
 *
 * @author auto create
 * @since 1.0, 2021-08-23 14:17:37
 */
public class ArRelInvoiceOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 3581961155735452123L;

	/**
	 * 发票行信息集合
	 */
	@ApiField("ar_invoice_lines")
	private ArInvoiceLineOpenApiResponse arInvoiceLines;

	/**
	 * 购方的地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购方开户行名称
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购方发票抬头，用于打印在发票上
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购方的电话号码
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 是否可以关联账单
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
	 * 电子发票在oss上的存储地址
	 */
	@ApiField("elc_invoice_url")
	private String elcInvoiceUrl;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 对应发票所在OU的id，用于标示该发票所述的OU。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 开票渠道，01：在线，02：线下
	 */
	@ApiField("invoice_channel")
	private String invoiceChannel;

	/**
	 * 发票编码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票的开票日期，yyyyMMdd
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票ID，唯一标示一张发票
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票介质，01：电子，02：纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 发票状态：用于标示发票当前的状态，状态类型以及相关含义 01：待开票，02：开票中，03：已开票，04：作废中，05：已作废，06：红冲中，07：已红冲，08：部分红冲，09：无效
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票类型：01：专票，02：普票，03：营业税发票，04：国际形式发票，05：其它发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 对应发票商户的ipId，在主站标示mid，在其他环境标示ip_id。
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户结算的ipRoleId，表示商户的结算对象，在主站表示pid。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最近修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 已关联账单金额
	 */
	@ApiField("linked_amt")
	private MultiCurrencyMoneyOpenApi linkedAmt;

	/**
	 * 发票开出后的邮寄状态，具体状态说明 01：待邮寄，02：已邮寄，03：退回中，04：已退回
	 */
	@ApiField("mail_status")
	private String mailStatus;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否是无账单发票 Y：是 N：不是
	 */
	@ApiField("no_bill_invoice_flag")
	private String noBillInvoiceFlag;

	/**
	 * 是否为线上发票 true：是， false：不是
	 */
	@ApiField("online")
	private Boolean online;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 邮件信息的主键，用于‘根据发票邮寄ID获取当前的邮寄信息’的查询输入。
	 */
	@ApiField("recent_mail_id")
	private String recentMailId;

	/**
	 * 是否红字 Y：红字， N：蓝字
	 */
	@ApiField("red")
	private String red;

	/**
	 * 发票的红冲金额
	 */
	@ApiField("red_amt")
	private MultiCurrencyMoneyOpenApi redAmt;

	/**
	 * 复核人
	 */
	@ApiField("reviewer")
	private String reviewer;

	/**
	 * 销方公司地址
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
	 * 销方税号，用于打印在发票上
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 销方公司电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public ArInvoiceLineOpenApiResponse getArInvoiceLines() {
		return this.arInvoiceLines;
	}
	public void setArInvoiceLines(ArInvoiceLineOpenApiResponse arInvoiceLines) {
		this.arInvoiceLines = arInvoiceLines;
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

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
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

	public Boolean getOnline() {
		return this.online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
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

	public String getRed() {
		return this.red;
	}
	public void setRed(String red) {
		this.red = red;
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

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
