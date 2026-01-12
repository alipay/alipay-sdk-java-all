package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票预览后，申请开票，发票中发票行修改后开票的order
 *
 * @author auto create
 * @since 1.0, 2023-09-14 19:21:07
 */
public class OpenApiInvoiceLinePreviewedOrder extends AlipayObject {

	private static final long serialVersionUID = 7217342743679576163L;

	/**
	 * 发票的票面金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 用于标识该发票是否为免税发票，Y代表免税发票，N代表非免税发票
	 */
	@ApiField("duty_free_flag")
	private String dutyFreeFlag;

	/**
	 * 发票的免税类型，当免税标识为Y时，需要传入该字段
	 */
	@ApiField("duty_free_type")
	private String dutyFreeType;

	/**
	 * 发票行对应的发票标识，标识改发票行对应的发票是哪一张
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票行在表中的唯一标识（主键），用于标识具体的发票中具体的一行发票行
	 */
	@ApiField("invoice_line_id")
	private String invoiceLineId;

	/**
	 * 发票行上，标识货物单位的字段
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 发票行中，用于标识具体货物或劳务名称的字段
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 劳务与货物名称的后缀，主要有账期（202309）、PID（2088XXXX）等
	 */
	@ApiField("product_name_suffix")
	private String productNameSuffix;

	/**
	 * 发票行商的规格型号字段
	 */
	@ApiField("product_specification")
	private String productSpecification;

	/**
	 * 发票行中标识货物数量的字段
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 发票票面的税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 税收分类编码是指税务总局编制的用于开具发票“货物或应税劳务、服务名称”项目时统一使用的分类与编码体系
	 */
	@ApiField("tax_classification_code")
	private String taxClassificationCode;

	/**
	 * 发票票面的不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

	/**
	 * 发票行税率，标识对应货物的税金征收率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 税种标识，1：营业税，2：增值税等
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 租户，标识站点
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 发票行中，标识获取单价的字段
	 */
	@ApiField("unit_amt")
	private String unitAmt;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}

	public String getDutyFreeFlag() {
		return this.dutyFreeFlag;
	}
	public void setDutyFreeFlag(String dutyFreeFlag) {
		this.dutyFreeFlag = dutyFreeFlag;
	}

	public String getDutyFreeType() {
		return this.dutyFreeType;
	}
	public void setDutyFreeType(String dutyFreeType) {
		this.dutyFreeType = dutyFreeType;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceLineId() {
		return this.invoiceLineId;
	}
	public void setInvoiceLineId(String invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameSuffix() {
		return this.productNameSuffix;
	}
	public void setProductNameSuffix(String productNameSuffix) {
		this.productNameSuffix = productNameSuffix;
	}

	public String getProductSpecification() {
		return this.productSpecification;
	}
	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxClassificationCode() {
		return this.taxClassificationCode;
	}
	public void setTaxClassificationCode(String taxClassificationCode) {
		this.taxClassificationCode = taxClassificationCode;
	}

	public MultiCurrencyMoneyOpenApi getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUnitAmt() {
		return this.unitAmt;
	}
	public void setUnitAmt(String unitAmt) {
		this.unitAmt = unitAmt;
	}

}
