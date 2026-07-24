package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class InvoiceItemDTO extends AlipayObject {

	private static final long serialVersionUID = 6719226133118249369L;

	/**
	 * 金额，单位：元
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 商品服务简称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 数量
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 税额，单位：元
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 含税金额，单位：元
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价，单位：元
	 */
	@ApiField("item_unit_amount")
	private String itemUnitAmount;

	/**
	 * 明细序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemCategoryName() {
		return this.itemCategoryName;
	}
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemTaxAmount() {
		return this.itemTaxAmount;
	}
	public void setItemTaxAmount(String itemTaxAmount) {
		this.itemTaxAmount = itemTaxAmount;
	}

	public String getItemTaxRate() {
		return this.itemTaxRate;
	}
	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}

	public String getItemTotalAmount() {
		return this.itemTotalAmount;
	}
	public void setItemTotalAmount(String itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemUnitAmount() {
		return this.itemUnitAmount;
	}
	public void setItemUnitAmount(String itemUnitAmount) {
		this.itemUnitAmount = itemUnitAmount;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
