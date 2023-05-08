package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行信息请求
 *
 * @author auto create
 * @since 1.0, 2022-11-08 20:42:33
 */
public class ApInvoiceLineOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 5353925985642445634L;

	/**
	 * 含税金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

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
	 * (invoiceType=01 || invoiceType=02 必填）税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * (invoiceType=01 || invoiceType=02 必填）不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

	/**
	 * (invoiceType=01 || invoiceType=02 必填，且大于0)税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 单价(元)
	 */
	@ApiField("unit_amt")
	private Long unitAmt;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
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
