package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行信息
 *
 * @author auto create
 * @since 1.0, 2023-05-18 16:11:02
 */
public class ArInvoiceLineOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 1313257185479751931L;

	/**
	 * 含税金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 免税标识
	 */
	@ApiField("duty_free_flag")
	private String dutyFreeFlag;

	/**
	 * 含税单价
	 */
	@ApiField("incl_tax_unit_amt")
	private Long inclTaxUnitAmt;

	/**
	 * 关联的发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票行iD
	 */
	@ApiField("invoice_line_id")
	private String invoiceLineId;

	/**
	 * 计量单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 货物或劳务名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 规格型号
	 */
	@ApiField("product_specification")
	private String productSpecification;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 单价
	 */
	@ApiField("unit_amt")
	private Long unitAmt;

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

	public Long getInclTaxUnitAmt() {
		return this.inclTaxUnitAmt;
	}
	public void setInclTaxUnitAmt(Long inclTaxUnitAmt) {
		this.inclTaxUnitAmt = inclTaxUnitAmt;
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

	public MultiCurrencyMoneyOpenApi getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public Long getUnitAmt() {
		return this.unitAmt;
	}
	public void setUnitAmt(Long unitAmt) {
		this.unitAmt = unitAmt;
	}

}
