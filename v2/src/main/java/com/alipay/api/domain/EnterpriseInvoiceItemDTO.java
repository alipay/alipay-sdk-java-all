package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业发票明细项
 *
 * @author auto create
 * @since 1.0, 2025-08-15 11:00:29
 */
public class EnterpriseInvoiceItemDTO extends AlipayObject {

	private static final long serialVersionUID = 1866471562432196766L;

	/**
	 * 价税合计。格式为2位小数，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发票项目名称/货物名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 税收分类编码
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 商品单价。单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 规格型号
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 总价 (不含税)。格式为2位小数，单位为元
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 税额。格式为2位小数，单位为元
	 */
	@ApiField("tax")
	private String tax;

	/**
	 * 税率。格式为2位小数，如：0.00, 0.03, 0.13
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

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

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
