package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票明细开放模型
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:05:49
 */
public class InvoiceItemOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5876998855935498293L;

	/**
	 * 明细行不含税金额，单位元，保留两位小数
	 */
	@ApiField("item_ex_tax_amount")
	private String itemExTaxAmount;

	/**
	 * 开票项目：货物或应税劳务、服务名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 国税局制定的商品税收编码，必须是最末级
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 数量；
1.当row_type=0或2且item_unit_price为空，可空；
2.可精确到小数点后6位
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 明细行价税合计，单位元，必须保证item_sum_amount=item_ex_tax_amount+item_tax_amount。
	 */
	@ApiField("item_sum_amount")
	private String itemSumAmount;

	/**
	 * 明细行税额，单位元，保留两位小数，无税或者免税情况下输入：0.00。
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 明细行税率，无税或者免税情况下输入：0.00。
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 不含税单价（元）;
1.当row_type=0或2且item_quantity为空，可空
2.可精确到小数点后8位；
	 */
	@ApiField("item_unit_price")
	private String itemUnitPrice;

	/**
	 * 发票行性质：0表示正常行，1表示折扣行，2表示被折扣行。
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
