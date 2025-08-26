package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票修改参数
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:12:03
 */
public class InputInvoiceModifyOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1879136795484313666L;

	/**
	 * 发票总金额，币种单位见currency字段
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 是否海外某些国家的发票使用
	 */
	@ApiField("authorized_dealer")
	private String authorizedDealer;

	/**
	 * 校验码
	 */
	@ApiField("check_sum")
	private String checkSum;

	/**
	 * 密文
	 */
	@ApiField("cipher_text")
	private String cipherText;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 有效税额，币种单位使用currency字段
	 */
	@ApiField("effective_tax_amount")
	private String effectiveTaxAmount;

	/**
	 * 不含税金额
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票id，通过发票登记接口录入发票后获取
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 发票介质类型
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
	@ApiField("invoice_remark")
	private String invoiceRemark;

	/**
	 * 代开销方名称
	 */
	@ApiField("issued_seller_name")
	private String issuedSellerName;

	/**
	 * 代开单位税号
	 */
	@ApiField("issued_tax_no")
	private String issuedTaxNo;

	/**
	 * 机器编码
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 购方开户行及账号
	 */
	@ApiField("purchaser_bank_info")
	private String purchaserBankInfo;

	/**
	 * 购方代码
	 */
	@ApiField("purchaser_code")
	private String purchaserCode;

	/**
	 * 购方地址及电话
	 */
	@ApiField("purchaser_contact_info")
	private String purchaserContactInfo;

	/**
	 * 购方国家编码
	 */
	@ApiField("purchaser_country_code")
	private String purchaserCountryCode;

	/**
	 * 购方名称
	 */
	@ApiField("purchaser_name")
	private String purchaserName;

	/**
	 * 购方地区编码
	 */
	@ApiField("purchaser_region_code")
	private String purchaserRegionCode;

	/**
	 * 购方税号
	 */
	@ApiField("purchaser_tax_no")
	private String purchaserTaxNo;

	/**
	 * 二维码标识
	 */
	@ApiField("qr_code_flag")
	private String qrCodeFlag;

	/**
	 * 关联单据号
	 */
	@ApiField("related_order")
	private String relatedOrder;

	/**
	 * 销方开户行及账号
	 */
	@ApiField("seller_bank_info")
	private String sellerBankInfo;

	/**
	 * 销方代码
	 */
	@ApiField("seller_code")
	private String sellerCode;

	/**
	 * 销方地址及电话
	 */
	@ApiField("seller_contact_info")
	private String sellerContactInfo;

	/**
	 * 销方国家编码
	 */
	@ApiField("seller_country_code")
	private String sellerCountryCode;

	/**
	 * 销方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 销方地区编码
	 */
	@ApiField("seller_region_code")
	private String sellerRegionCode;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 发票税额，币种单位使用currency字段
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthorizedDealer() {
		return this.authorizedDealer;
	}
	public void setAuthorizedDealer(String authorizedDealer) {
		this.authorizedDealer = authorizedDealer;
	}

	public String getCheckSum() {
		return this.checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public String getCipherText() {
		return this.cipherText;
	}
	public void setCipherText(String cipherText) {
		this.cipherText = cipherText;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEffectiveTaxAmount() {
		return this.effectiveTaxAmount;
	}
	public void setEffectiveTaxAmount(String effectiveTaxAmount) {
		this.effectiveTaxAmount = effectiveTaxAmount;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
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

	public String getInvoiceRemark() {
		return this.invoiceRemark;
	}
	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}

	public String getIssuedSellerName() {
		return this.issuedSellerName;
	}
	public void setIssuedSellerName(String issuedSellerName) {
		this.issuedSellerName = issuedSellerName;
	}

	public String getIssuedTaxNo() {
		return this.issuedTaxNo;
	}
	public void setIssuedTaxNo(String issuedTaxNo) {
		this.issuedTaxNo = issuedTaxNo;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getPurchaserBankInfo() {
		return this.purchaserBankInfo;
	}
	public void setPurchaserBankInfo(String purchaserBankInfo) {
		this.purchaserBankInfo = purchaserBankInfo;
	}

	public String getPurchaserCode() {
		return this.purchaserCode;
	}
	public void setPurchaserCode(String purchaserCode) {
		this.purchaserCode = purchaserCode;
	}

	public String getPurchaserContactInfo() {
		return this.purchaserContactInfo;
	}
	public void setPurchaserContactInfo(String purchaserContactInfo) {
		this.purchaserContactInfo = purchaserContactInfo;
	}

	public String getPurchaserCountryCode() {
		return this.purchaserCountryCode;
	}
	public void setPurchaserCountryCode(String purchaserCountryCode) {
		this.purchaserCountryCode = purchaserCountryCode;
	}

	public String getPurchaserName() {
		return this.purchaserName;
	}
	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public String getPurchaserRegionCode() {
		return this.purchaserRegionCode;
	}
	public void setPurchaserRegionCode(String purchaserRegionCode) {
		this.purchaserRegionCode = purchaserRegionCode;
	}

	public String getPurchaserTaxNo() {
		return this.purchaserTaxNo;
	}
	public void setPurchaserTaxNo(String purchaserTaxNo) {
		this.purchaserTaxNo = purchaserTaxNo;
	}

	public String getQrCodeFlag() {
		return this.qrCodeFlag;
	}
	public void setQrCodeFlag(String qrCodeFlag) {
		this.qrCodeFlag = qrCodeFlag;
	}

	public String getRelatedOrder() {
		return this.relatedOrder;
	}
	public void setRelatedOrder(String relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public String getSellerBankInfo() {
		return this.sellerBankInfo;
	}
	public void setSellerBankInfo(String sellerBankInfo) {
		this.sellerBankInfo = sellerBankInfo;
	}

	public String getSellerCode() {
		return this.sellerCode;
	}
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public String getSellerContactInfo() {
		return this.sellerContactInfo;
	}
	public void setSellerContactInfo(String sellerContactInfo) {
		this.sellerContactInfo = sellerContactInfo;
	}

	public String getSellerCountryCode() {
		return this.sellerCountryCode;
	}
	public void setSellerCountryCode(String sellerCountryCode) {
		this.sellerCountryCode = sellerCountryCode;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerRegionCode() {
		return this.sellerRegionCode;
	}
	public void setSellerRegionCode(String sellerRegionCode) {
		this.sellerRegionCode = sellerRegionCode;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
