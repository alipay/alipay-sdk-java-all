package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票验真发票行
 *
 * @author auto create
 * @since 1.0, 2023-07-21 17:49:44
 */
public class InputInvoiceCheckLine extends AlipayObject {

	private static final long serialVersionUID = 8882599874883994249L;

	/**
	 * 含税金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * Y:免税
	 */
	@ApiField("duty_free_flag")
	private String dutyFreeFlag;

	/**
	 * 计量单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 货物名称
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
	private String quantity;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private String taxExclusiveAmt;

	/**
	 * 税率,两位小数
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 单价
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDutyFreeFlag() {
		return this.dutyFreeFlag;
	}
	public void setDutyFreeFlag(String dutyFreeFlag) {
		this.dutyFreeFlag = dutyFreeFlag;
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

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(String taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
