package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票明细
 *
 * @author auto create
 * @since 1.0, 2025-06-26 10:43:08
 */
public class InvoiceDetail extends AlipayObject {

	private static final long serialVersionUID = 3632913138672914915L;

	/**
	 * 产品单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 服务名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品型号
	 */
	@ApiField("product_specification")
	private String productSpecification;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 单价-元
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 税额-元
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税额币种
	 */
	@ApiField("tax_amount_currency")
	private String taxAmountCurrency;

	/**
	 * 不含税金额-元
	 */
	@ApiField("tax_exclusive_amount")
	private String taxExclusiveAmount;

	/**
	 * 不含税金额币种
	 */
	@ApiField("tax_exclusive_amount_currency")
	private String taxExclusiveAmountCurrency;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

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

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxAmountCurrency() {
		return this.taxAmountCurrency;
	}
	public void setTaxAmountCurrency(String taxAmountCurrency) {
		this.taxAmountCurrency = taxAmountCurrency;
	}

	public String getTaxExclusiveAmount() {
		return this.taxExclusiveAmount;
	}
	public void setTaxExclusiveAmount(String taxExclusiveAmount) {
		this.taxExclusiveAmount = taxExclusiveAmount;
	}

	public String getTaxExclusiveAmountCurrency() {
		return this.taxExclusiveAmountCurrency;
	}
	public void setTaxExclusiveAmountCurrency(String taxExclusiveAmountCurrency) {
		this.taxExclusiveAmountCurrency = taxExclusiveAmountCurrency;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
