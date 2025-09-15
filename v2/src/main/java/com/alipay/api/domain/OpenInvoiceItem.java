package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票明细信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 18:39:21
 */
public class OpenInvoiceItem extends AlipayObject {

	private static final long serialVersionUID = 8779619612774654183L;

	/**
	 * 商品单价（元）
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 商品货物/服务名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 商品规格
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 商品税额（元）
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 商品税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 商品总价（元）
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

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

}
