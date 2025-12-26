package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票内容
 *
 * @author auto create
 * @since 1.0, 2024-03-13 14:08:06
 */
public class InvoiceContentInfo extends AlipayObject {

	private static final long serialVersionUID = 2651973397444849122L;

	/**
	 * 含税金额（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发票项目名称/货物名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品编码/税收分类编码
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 规格型号
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 不含税金额（元）
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 税额
	 */
	@ApiField("tax")
	private String tax;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 税率标识，只有税率为0的情况才有值，0=出口零税率，1=免税，2=不征收，3=普通零税率
	 */
	@ApiField("zero_rate_flag")
	private String zeroRateFlag;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSumPrice() {
		return this.sumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}

	public String getTax() {
		return this.tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getZeroRateFlag() {
		return this.zeroRateFlag;
	}
	public void setZeroRateFlag(String zeroRateFlag) {
		this.zeroRateFlag = zeroRateFlag;
	}

}
