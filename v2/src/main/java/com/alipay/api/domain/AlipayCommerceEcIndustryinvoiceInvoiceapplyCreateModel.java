package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付可开票开票申请创建
 *
 * @author auto create
 * @since 1.0, 2025-08-11 23:07:19
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7828722332816312476L;

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
	 * 购买方证件类型对应税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 购买方证件类型
	 */
	@ApiField("buyer_tax_no_type")
	private String buyerTaxNoType;

	/**
	 * 购买方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/**
	 * 商品明细列表，根据产品区分
	 */
	@ApiListField("invoice_item_list")
	@ApiField("industry_invoice_item_info")
	private List<IndustryInvoiceItemInfo> invoiceItemList;

	/**
	 * 发票票种
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 红冲原因
	 */
	@ApiField("invoice_red_reason")
	private String invoiceRedReason;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 外部开票申请ID
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	/**
	 * 发票产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 不动产信息列表
	 */
	@ApiListField("real_property_business_list")
	@ApiField("industry_invoice_real_property_business")
	private List<IndustryInvoiceRealPropertyBusiness> realPropertyBusinessList;

	/**
	 * 关联蓝票发票号码，开票类型为红票时必传，暂时仅支持全额红冲
	 */
	@ApiField("related_blue_invoice_no")
	private String relatedBlueInvoiceNo;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 交易信息列表,当前仅支持单个交易,交易渠道仅支持支付宝-ALIPAY
	 */
	@ApiListField("trade_list")
	@ApiField("industry_invoice_trade_info")
	private List<IndustryInvoiceTradeInfo> tradeList;

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

	public String getBuyerTaxNoType() {
		return this.buyerTaxNoType;
	}
	public void setBuyerTaxNoType(String buyerTaxNoType) {
		this.buyerTaxNoType = buyerTaxNoType;
	}

	public String getBuyerTel() {
		return this.buyerTel;
	}
	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}

	public List<IndustryInvoiceItemInfo> getInvoiceItemList() {
		return this.invoiceItemList;
	}
	public void setInvoiceItemList(List<IndustryInvoiceItemInfo> invoiceItemList) {
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

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<IndustryInvoiceRealPropertyBusiness> getRealPropertyBusinessList() {
		return this.realPropertyBusinessList;
	}
	public void setRealPropertyBusinessList(List<IndustryInvoiceRealPropertyBusiness> realPropertyBusinessList) {
		this.realPropertyBusinessList = realPropertyBusinessList;
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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public List<IndustryInvoiceTradeInfo> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<IndustryInvoiceTradeInfo> tradeList) {
		this.tradeList = tradeList;
	}

}
