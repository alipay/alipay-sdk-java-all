package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联发票请求
 *
 * @author auto create
 * @since 1.0, 2022-03-02 15:10:50
 */
public class RelateInputInvoiceOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 8164844837223851221L;

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
	 * 账单与发票关联信息
	 */
	@ApiListField("input_invoice_bill_link_order_list")
	@ApiField("input_invoice_bill_link_order_d_t_o")
	private List<InputInvoiceBillLinkOrderDTO> inputInvoiceBillLinkOrderList;

	/**
	 * OU
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 票面金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票行信息
	 */
	@ApiListField("invoice_line_orders")
	@ApiField("ap_invoice_line_order_request")
	private List<ApInvoiceLineOrderRequest> invoiceLineOrders;

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
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 收票日期
	 */
	@ApiField("invoice_receive_date")
	private String invoiceReceiveDate;

	/**
	 * 发票来源 -01 手工输入 -02 扫描录入
	 */
	@ApiField("invoice_source")
	private String invoiceSource;

	/**
	 * 发票种类 01增值税专用发票 02增值税普通发票 03国际形式发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

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
	 * 票面税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

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

	public List<InputInvoiceBillLinkOrderDTO> getInputInvoiceBillLinkOrderList() {
		return this.inputInvoiceBillLinkOrderList;
	}
	public void setInputInvoiceBillLinkOrderList(List<InputInvoiceBillLinkOrderDTO> inputInvoiceBillLinkOrderList) {
		this.inputInvoiceBillLinkOrderList = inputInvoiceBillLinkOrderList;
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

	public List<ApInvoiceLineOrderRequest> getInvoiceLineOrders() {
		return this.invoiceLineOrders;
	}
	public void setInvoiceLineOrders(List<ApInvoiceLineOrderRequest> invoiceLineOrders) {
		this.invoiceLineOrders = invoiceLineOrders;
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

	public String getInvoiceReceiveDate() {
		return this.invoiceReceiveDate;
	}
	public void setInvoiceReceiveDate(String invoiceReceiveDate) {
		this.invoiceReceiveDate = invoiceReceiveDate;
	}

	public String getInvoiceSource() {
		return this.invoiceSource;
	}
	public void setInvoiceSource(String invoiceSource) {
		this.invoiceSource = invoiceSource;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
