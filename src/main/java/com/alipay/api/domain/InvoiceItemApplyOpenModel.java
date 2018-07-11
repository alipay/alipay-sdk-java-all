package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票内容项申请模型
 *
 * @author auto create
 * @since 1.0, 2017-05-09 14:11:07
 */
public class InvoiceItemApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7511163384744641252L;

	/**
	 * 明细不含税金额，该值为item_quantity＊item_unit_price，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段不必传
	 */
	@ApiField("item_ex_tax_amount")
	private String itemExTaxAmount;

	/**
	 * 发票项目名称（或商品名称）
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品编号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 商品型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 明细价税合计。该值为item_tax_amount＋item_ex_tax_amount，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段可不传。
	 */
	@ApiField("item_sum_amount")
	private String itemSumAmount;

	/**
	 * 明细税额，该值为item_ex_tax_amount*item_tax_rate,依据税控厂商的不同，对于目前对接的浙江航信和阿里平台，该字段可不传
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_unit_price")
	private String itemUnitPrice;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
	 */
	@ApiField("row_type")
	private String rowType;

	public String getItemExTaxAmount() {
		return this.itemExTaxAmount;
	}
	public void setItemExTaxAmount(String itemExTaxAmount) {
		this.itemExTaxAmount = itemExTaxAmount;
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

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemSumAmount() {
		return this.itemSumAmount;
	}
	public void setItemSumAmount(String itemSumAmount) {
		this.itemSumAmount = itemSumAmount;
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

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

}
