package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票申请提交
 *
 * @author auto create
 * @since 1.0, 2024-09-09 19:49:51
 */
public class AlipayCommerceEcTcnOpeninvoiceapplySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4363912989777147715L;

	/**
	 * 开票申请明细列表
	 */
	@ApiListField("apply_detail_list")
	@ApiField("open_invoice_apply_detail")
	private List<OpenInvoiceApplyDetail> applyDetailList;

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
	 * 交付邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 行业类型
	 */
	@ApiField("industry_type")
	private String industryType;

	/**
	 * 申请开票金额（元）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 交付手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 平台申请ID
	 */
	@ApiField("platform_apply_id")
	private String platformApplyId;

	/**
	 * 行程信息列表
	 */
	@ApiListField("travel_info_list")
	@ApiField("open_invoice_travel_info")
	private List<OpenInvoiceTravelInfo> travelInfoList;

	public List<OpenInvoiceApplyDetail> getApplyDetailList() {
		return this.applyDetailList;
	}
	public void setApplyDetailList(List<OpenInvoiceApplyDetail> applyDetailList) {
		this.applyDetailList = applyDetailList;
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

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlatformApplyId() {
		return this.platformApplyId;
	}
	public void setPlatformApplyId(String platformApplyId) {
		this.platformApplyId = platformApplyId;
	}

	public List<OpenInvoiceTravelInfo> getTravelInfoList() {
		return this.travelInfoList;
	}
	public void setTravelInfoList(List<OpenInvoiceTravelInfo> travelInfoList) {
		this.travelInfoList = travelInfoList;
	}

}
