package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenInvoiceTravelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoiceapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:12
 */
public class AlipayCommerceEcTcnInvoiceapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7772323991564211458L;

	/** 
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 提交申请时间
	 */
	@ApiField("apply_time")
	private String applyTime;

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
	 * 申请失败原因描述
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 申请开票金额（元）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票介质类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/** 
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/** 
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 商品税编
	 */
	@ApiField("item_tax_code")
	private String itemTaxCode;

	/** 
	 * 商品税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/** 
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/** 
	 * 平台申请ID
	 */
	@ApiField("platform_apply_id")
	private String platformApplyId;

	/** 
	 * 行程信息列表
	 */
	@ApiField("travel_info_list")
	private OpenInvoiceTravelInfo travelInfoList;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getApplyTime( ) {
		return this.applyTime;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerAddress( ) {
		return this.buyerAddress;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getBuyerBankAccount( ) {
		return this.buyerBankAccount;
	}

	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public String getBuyerBankName( ) {
		return this.buyerBankName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerName( ) {
		return this.buyerName;
	}

	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}
	public String getBuyerTaxNo( ) {
		return this.buyerTaxNo;
	}

	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerTel( ) {
		return this.buyerTel;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}
	public String getFailedReason( ) {
		return this.failedReason;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind( ) {
		return this.invoiceKind;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType( ) {
		return this.invoiceType;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setItemTaxCode(String itemTaxCode) {
		this.itemTaxCode = itemTaxCode;
	}
	public String getItemTaxCode( ) {
		return this.itemTaxCode;
	}

	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}
	public String getItemTaxRate( ) {
		return this.itemTaxRate;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public String getItemUnit( ) {
		return this.itemUnit;
	}

	public void setPlatformApplyId(String platformApplyId) {
		this.platformApplyId = platformApplyId;
	}
	public String getPlatformApplyId( ) {
		return this.platformApplyId;
	}

	public void setTravelInfoList(OpenInvoiceTravelInfo travelInfoList) {
		this.travelInfoList = travelInfoList;
	}
	public OpenInvoiceTravelInfo getTravelInfoList( ) {
		return this.travelInfoList;
	}

}
