package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付可开票开票申请创建
 *
 * @author auto create
 * @since 1.0, 2025-09-10 00:31:43
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2499845774962454227L;

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
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 开票员姓名，用户可自助选择开票员传入，开票员姓名，证件类型，证件号码，必须同时存在，同时为空。
用户传入的开票员将会校验其合法性（开票员是否授权开票）
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 开票员证件号码
	 */
	@ApiField("clerk_cert_no")
	private String clerkCertNo;

	/**
	 * 开票员证件类型
	 */
	@ApiField("clerk_cert_type")
	private String clerkCertType;

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
	 * 购买方自然人证件号码
	 */
	@ApiField("nature_person_cert_no")
	private String naturePersonCertNo;

	/**
	 * 购买方自然人身份证件类型
更多枚举详情见：
<a href="https://opendocs.alipay.com/mini/0i32us">https://opendocs.alipay.com/mini/0i32us</a>
	 */
	@ApiField("nature_person_cert_type")
	private String naturePersonCertType;

	/**
	 * 当“自然人证件类型”选择“居民身份证”时，校验是否为“中国”;
当“自然人证件类型”选择“港澳居民来往内地通行证”时，如果“证件号码 ”以H开头，“国籍(或地区)”必须为“中国香港”;如果“证件号码”以M开头，“国籍 (或地区)”必须为“中国澳门”;校验证件号码必须以H或M开头。
 当“自然人证件类型”选择“台湾居民来往大陆通行证”时，校验是否为 “中国台湾”。
当“自然人证件类型”选择“中华人民共和国护照”时，校验是否为“中国”。
 当“自然人证件类型”选择“中华人民共和国港澳居民居住证”时，校验证件 号码必须以810000或820000开头，如果“证件号码”以810000开头，“国籍(或地区)”必须为 “中国香港”;如果“证件号码”以820000开头，“国籍(或地区)”必须为“中国澳门 ”;
当“自然人证件类型”选择“中华人民共和国台湾居民居住证”时，校验是否为“中国台湾”。

更多枚举详情见：<a href="https://opendocs.alipay.com/mini/0i32us">https://opendocs.alipay.com/mini/0i32us</a>
	 */
	@ApiField("nature_person_country")
	private String naturePersonCountry;

	/**
	 * 购买方自然人标志为N时，购买方信息（ (购买方)自然人国籍代码、(购买方)自然人证件类型、(购买方)自然人证件号码)）必须为空
购买方自然人标志为Y时，若“(购买方)自然人证件类型”填写“居民身份证”，购买方纳税人识别号必须与(购买方)自然人证件号码完全一致
	 */
	@ApiField("nature_person_flag")
	private String naturePersonFlag;

	/**
	 * 外部开票申请ID
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

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
	 * 销售方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/**
	 * 销售方银行卡账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 销售方电话
	 */
	@ApiField("seller_tel")
	private String sellerTel;

	/**
	 * 是否展示购买方方银行信息
字段值为Y，则会在发票上展示购买方的银行信息（购买方开户行，购买方银行卡账号），不填默认为N
	 */
	@ApiField("show_buyer_bank_info")
	private String showBuyerBankInfo;

	/**
	 * 是否展示销售方银行信息
字段值为Y，则会在发票上展示销售方的银行信息（销售方开户行，销售方银行卡账号），不填默认为N
	 */
	@ApiField("show_seller_bank_info")
	private String showSellerBankInfo;

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

	public String getClerkCertNo() {
		return this.clerkCertNo;
	}
	public void setClerkCertNo(String clerkCertNo) {
		this.clerkCertNo = clerkCertNo;
	}

	public String getClerkCertType() {
		return this.clerkCertType;
	}
	public void setClerkCertType(String clerkCertType) {
		this.clerkCertType = clerkCertType;
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

	public String getNaturePersonCertNo() {
		return this.naturePersonCertNo;
	}
	public void setNaturePersonCertNo(String naturePersonCertNo) {
		this.naturePersonCertNo = naturePersonCertNo;
	}

	public String getNaturePersonCertType() {
		return this.naturePersonCertType;
	}
	public void setNaturePersonCertType(String naturePersonCertType) {
		this.naturePersonCertType = naturePersonCertType;
	}

	public String getNaturePersonCountry() {
		return this.naturePersonCountry;
	}
	public void setNaturePersonCountry(String naturePersonCountry) {
		this.naturePersonCountry = naturePersonCountry;
	}

	public String getNaturePersonFlag() {
		return this.naturePersonFlag;
	}
	public void setNaturePersonFlag(String naturePersonFlag) {
		this.naturePersonFlag = naturePersonFlag;
	}

	public String getOuterApplyId() {
		return this.outerApplyId;
	}
	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
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

	public String getSellerTel() {
		return this.sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}

	public String getShowBuyerBankInfo() {
		return this.showBuyerBankInfo;
	}
	public void setShowBuyerBankInfo(String showBuyerBankInfo) {
		this.showBuyerBankInfo = showBuyerBankInfo;
	}

	public String getShowSellerBankInfo() {
		return this.showSellerBankInfo;
	}
	public void setShowSellerBankInfo(String showSellerBankInfo) {
		this.showSellerBankInfo = showSellerBankInfo;
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
