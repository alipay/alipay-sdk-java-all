package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码账单申请开票
 *
 * @author auto create
 * @since 1.0, 2026-03-17 20:57:43
 */
public class AlipayCommerceEcInvoiceConsumeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8191822317143147196L;

	/**
	 * 支付宝交易号，可通过查询企业码账单详情获取
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购买方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购买方开户行
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 购买方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购买方证件类型对应税号，根据购方提供的信息填写
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购买方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/**
	 * 付款方企业id，可通过查询入驻企业码企业详情获取
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * null
	 */
	@ApiListField("invoice_item_list")
	@ApiField("invoice_merchant_item")
	private List<InvoiceMerchantItem> invoiceItemList;

	/**
	 * 发票票种
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发起发票红冲原因
	 */
	@ApiField("invoice_red_reason")
	private String invoiceRedReason;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 外部开票申请id，调用方自定义生成，且保证唯一
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	/**
	 * 发起发票红冲时对应原始蓝票的发票号码
	 */
	@ApiField("related_blue_invoice_no")
	private String relatedBlueInvoiceNo;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 收款方企业id，可通过查询入驻企业码企业详情
	 */
	@ApiField("seller_enterprise_id")
	private String sellerEnterpriseId;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<InvoiceMerchantItem> getInvoiceItemList() {
		return this.invoiceItemList;
	}
	public void setInvoiceItemList(List<InvoiceMerchantItem> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceRedReason() {
		return this.invoiceRedReason;
	}
	public void setInvoiceRedReason(String invoiceRedReason) {
		this.invoiceRedReason = invoiceRedReason;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOuterApplyId() {
		return this.outerApplyId;
	}
	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
	}

	public String getRelatedBlueInvoiceNo() {
		return this.relatedBlueInvoiceNo;
	}
	public void setRelatedBlueInvoiceNo(String relatedBlueInvoiceNo) {
		this.relatedBlueInvoiceNo = relatedBlueInvoiceNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSellerEnterpriseId() {
		return this.sellerEnterpriseId;
	}
	public void setSellerEnterpriseId(String sellerEnterpriseId) {
		this.sellerEnterpriseId = sellerEnterpriseId;
	}

}
