package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应付发票请求
 *
 * @author auto create
 * @since 1.0, 2020-01-14 14:16:15
 */
public class ApInvoiceOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 5679167732335798976L;

	/**
	 * （invoiceType !=07时，必填；修改操作必填）发票行信息，发票行数大于等于1，不能超过8
	 */
	@ApiListField("ap_invoice_line_orders")
	@ApiField("ap_invoice_line_order_request")
	private List<ApInvoiceLineOrderRequest> apInvoiceLineOrders;

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
	 * 业务类型，为空时默认 COMMISSION
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * （invoiceType=01时，必填）购方公司地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * （invoiceType=01时，必填）购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * （invoiceType=01时，必填）购方开户行名称
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * （invoiceType !=07时，必填）购方机构id
	 */
	@ApiField("buyer_inst_id")
	private String buyerInstId;

	/**
	 * （invoiceType !=07时，必填）购方发票抬头
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * （invoiceType=01时，必填）购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * （invoiceType=01时，必填）购方公司电话
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/**
	 * 票面金额，不能为空或小于等于0
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）开票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）收票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_receive_date")
	private String invoiceReceiveDate;

	/**
	 * （invoiceType !=07时，必填；修改操作必填）发票来源 01-手工输入 02-扫描录入
	 */
	@ApiField("invoice_source")
	private String invoiceSource;

	/**
	 * 发票种类 {"01":"增值税专用发票","02":"增值税普通发票","03":"营业税发票","04":"国际形式发票","05":"其它发票","07":"虚拟发票(无法收票时使用)"}
批量新增发票时,发票类型必须一致
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否红字 Y红字 N蓝字；发票必须为蓝字发票
	 */
	@ApiField("red")
	private String red;

	/**
	 * （invoiceType=01时，必填）销方公司地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * （invoiceType=01时，必填）销方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * （invoiceType=01时，必填）销方开户行名称
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）销方公司名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * （invoiceType != 07时，必填；修改操作必填）销方角色id-主站为uid
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 销方mid
	 */
	@ApiField("seller_mid")
	private String sellerMid;

	/**
	 * （invoiceType=01时，必填）销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * invoiceType=01时，必填）销方公司电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	public List<ApInvoiceLineOrderRequest> getApInvoiceLineOrders() {
		return this.apInvoiceLineOrders;
	}
	public void setApInvoiceLineOrders(List<ApInvoiceLineOrderRequest> apInvoiceLineOrders) {
		this.apInvoiceLineOrders = apInvoiceLineOrders;
	}

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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRed() {
		return this.red;
	}
	public void setRed(String red) {
		this.red = red;
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

}
