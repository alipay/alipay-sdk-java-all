package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请商品明细列表
 *
 * @author auto create
 * @since 1.0, 2026-08-28 15:24:52
 */
public class InvoiceApplyItems extends AlipayObject {

	private static final long serialVersionUID = 5521447344976197294L;

	/**
	 * 商品明细金额
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 开票商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量，按开票金额除以含税单价计
	 */
	@ApiField("item_quantity")
	private String itemQuantity;

	/**
	 * 开票商品的规格或型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 开票商品对应的税收分类编码
	 */
	@ApiField("item_tax_code")
	private String itemTaxCode;

	/**
	 * 商品适用税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 开票商品计量单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 商品含税单价
	 */
	@ApiField("item_unit_amount_with_tax")
	private String itemUnitAmountWithTax;

	public String getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemTaxCode() {
		return this.itemTaxCode;
	}
	public void setItemTaxCode(String itemTaxCode) {
		this.itemTaxCode = itemTaxCode;
	}

	public String getItemTaxRate() {
		return this.itemTaxRate;
	}
	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemUnitAmountWithTax() {
		return this.itemUnitAmountWithTax;
	}
	public void setItemUnitAmountWithTax(String itemUnitAmountWithTax) {
		this.itemUnitAmountWithTax = itemUnitAmountWithTax;
	}

}
