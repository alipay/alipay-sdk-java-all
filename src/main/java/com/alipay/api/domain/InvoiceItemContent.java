package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票平台发票明细项
 *
 * @author auto create
 * @since 1.0, 2020-12-23 21:57:03
 */
public class InvoiceItemContent extends AlipayObject {

	private static final long serialVersionUID = 3457871298432744786L;

	/**
	 * 价税合计。(等于sumPrice和tax之和)
	 */
	@ApiField("item_amount")
	private String itemAmount;

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
	 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 单项总价，格式：100.00
	 */
	@ApiField("item_sum_price")
	private String itemSumPrice;

	/**
	 * 税额
	 */
	@ApiField("item_tax_price")
	private String itemTaxPrice;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 台
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
	 */
	@ApiField("row_type")
	private Long rowType;

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

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemSumPrice() {
		return this.itemSumPrice;
	}
	public void setItemSumPrice(String itemSumPrice) {
		this.itemSumPrice = itemSumPrice;
	}

	public String getItemTaxPrice() {
		return this.itemTaxPrice;
	}
	public void setItemTaxPrice(String itemTaxPrice) {
		this.itemTaxPrice = itemTaxPrice;
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

	public Long getRowType() {
		return this.rowType;
	}
	public void setRowType(Long rowType) {
		this.rowType = rowType;
	}

}
