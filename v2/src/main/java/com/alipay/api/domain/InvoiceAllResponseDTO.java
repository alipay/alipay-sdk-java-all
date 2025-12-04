package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票全量信息
 *
 * @author auto create
 * @since 1.0, 2022-09-21 15:44:36
 */
public class InvoiceAllResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 7765671475375121766L;

	/**
	 * 发票附件的名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * 发票附件的osskey
	 */
	@ApiField("attachment_oss_key")
	private String attachmentOssKey;

	/**
	 * 购方公司地址
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
	 * 购方机构id
	 */
	@ApiField("buyer_inst_id")
	private String buyerInstId;

	/**
	 * 购方发票抬头
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购方公司电话
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 不含税金额
	 */
	@ApiField("exclude_tax_amt")
	private MultiCurrencyMoneyOpenApi excludeTaxAmt;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 发票认证时间
	 */
	@ApiField("invoice_auth_date")
	private String invoiceAuthDate;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期 格式(yyyy_m_mdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票行信息
	 */
	@ApiListField("invoice_line_list")
	@ApiField("invoice_line_response_d_t_o")
	private List<InvoiceLineResponseDTO> invoiceLineList;

	/**
	 * 发票邮寄状态code
	 */
	@ApiField("invoice_mail_status")
	private String invoiceMailStatus;

	/**
	 * 发票邮寄状态name
	 */
	@ApiField("invoice_mail_status_name")
	private String invoiceMailStatusName;

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
	 * 收票日期 格式(yyyy_m_mdd)
	 */
	@ApiField("invoice_rcv_date")
	private String invoiceRcvDate;

	/**
	 * 发票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票状态name
	 */
	@ApiField("invoice_status_name")
	private String invoiceStatusName;

	/**
	 * 发票种类 code
     * 01,增值税专用发票;
     * 02,增值税普通发票;
     * 04,国际形式发票;
     * 05,其它发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 发票种类 name
	 */
	@ApiField("invoice_type_name")
	private String invoiceTypeName;

	/**
	 * 是否红字 _y红字 _n蓝字
	 */
	@ApiField("is_red")
	private String isRed;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 已关联金额
	 */
	@ApiField("relevant_amt")
	private MultiCurrencyMoneyOpenApi relevantAmt;

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
	 * 商户名称
	 */
	@ApiField("seller_custm_name")
	private String sellerCustmName;

	/**
	 * 销方角色id
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 销方mid
	 */
	@ApiField("seller_mid")
	private String sellerMid;

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

	public String getBuyerInstId() {
		return this.buyerInstId;
	}
	public void setBuyerInstId(String buyerInstId) {
		this.buyerInstId = buyerInstId;
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

	public MultiCurrencyMoneyOpenApi getExcludeTaxAmt() {
		return this.excludeTaxAmt;
	}
	public void setExcludeTaxAmt(MultiCurrencyMoneyOpenApi excludeTaxAmt) {
		this.excludeTaxAmt = excludeTaxAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceAuthDate() {
		return this.invoiceAuthDate;
	}
	public void setInvoiceAuthDate(String invoiceAuthDate) {
		this.invoiceAuthDate = invoiceAuthDate;
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

	public List<InvoiceLineResponseDTO> getInvoiceLineList() {
		return this.invoiceLineList;
	}
	public void setInvoiceLineList(List<InvoiceLineResponseDTO> invoiceLineList) {
		this.invoiceLineList = invoiceLineList;
	}

	public String getInvoiceMailStatus() {
		return this.invoiceMailStatus;
	}
	public void setInvoiceMailStatus(String invoiceMailStatus) {
		this.invoiceMailStatus = invoiceMailStatus;
	}

	public String getInvoiceMailStatusName() {
		return this.invoiceMailStatusName;
	}
	public void setInvoiceMailStatusName(String invoiceMailStatusName) {
		this.invoiceMailStatusName = invoiceMailStatusName;
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

	public String getInvoiceRcvDate() {
		return this.invoiceRcvDate;
	}
	public void setInvoiceRcvDate(String invoiceRcvDate) {
		this.invoiceRcvDate = invoiceRcvDate;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceStatusName() {
		return this.invoiceStatusName;
	}
	public void setInvoiceStatusName(String invoiceStatusName) {
		this.invoiceStatusName = invoiceStatusName;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeName() {
		return this.invoiceTypeName;
	}
	public void setInvoiceTypeName(String invoiceTypeName) {
		this.invoiceTypeName = invoiceTypeName;
	}

	public String getIsRed() {
		return this.isRed;
	}
	public void setIsRed(String isRed) {
		this.isRed = isRed;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public MultiCurrencyMoneyOpenApi getRelevantAmt() {
		return this.relevantAmt;
	}
	public void setRelevantAmt(MultiCurrencyMoneyOpenApi relevantAmt) {
		this.relevantAmt = relevantAmt;
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

	public String getSellerCustmName() {
		return this.sellerCustmName;
	}
	public void setSellerCustmName(String sellerCustmName) {
		this.sellerCustmName = sellerCustmName;
	}

	public String getSellerIpRoleId() {
		return this.sellerIpRoleId;
	}
	public void setSellerIpRoleId(String sellerIpRoleId) {
		this.sellerIpRoleId = sellerIpRoleId;
	}

	public String getSellerMid() {
		return this.sellerMid;
	}
	public void setSellerMid(String sellerMid) {
		this.sellerMid = sellerMid;
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

}
