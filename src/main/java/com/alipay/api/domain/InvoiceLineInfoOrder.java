package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行信息
 *
 * @author auto create
 * @since 1.0, 2022-04-14 16:09:02
 */
public class InvoiceLineInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 7125761156774343664L;

	/**
	 * 免税标记 Y:免税 N：不免税 税率为零时必须指定
	 */
	@ApiField("duty_free_flag")
	private String dutyFreeFlag;

	/**
	 * 免税类型；00：出口零税率，01：免税；02：不征收；03：普通零税率
	 */
	@ApiField("duty_free_type")
	private String dutyFreeType;

	/**
	 * 金额
	 */
	@ApiField("line_amt")
	private MultiCurrencyMoneyOpenApi lineAmt;

	/**
	 * 计量单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 打印在发票上面的发票行的商品名称
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
	 * 税率，免税的时候传0
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 数量和单价不能同时存在
	 */
	@ApiField("unit_amt")
	private String unitAmt;

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

	public MultiCurrencyMoneyOpenApi getLineAmt() {
		return this.lineAmt;
	}
	public void setLineAmt(MultiCurrencyMoneyOpenApi lineAmt) {
		this.lineAmt = lineAmt;
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

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnitAmt() {
		return this.unitAmt;
	}
	public void setUnitAmt(String unitAmt) {
		this.unitAmt = unitAmt;
	}

}
