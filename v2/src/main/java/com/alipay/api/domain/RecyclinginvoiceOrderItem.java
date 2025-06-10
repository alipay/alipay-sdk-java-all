package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票订单明细
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:37
 */
public class RecyclinginvoiceOrderItem extends AlipayObject {

	private static final long serialVersionUID = 6558215937714871996L;

	/**
	 * 企业商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 商品服务简称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 数量（整数最长七位，小数最长六位）
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 金额（元，整数最长七位，小数最长两位）
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 单价（元，整数最长七位，小数最长六位）
	 */
	@ApiField("item_unit_amount")
	private String itemUnitAmount;

	/**
	 * 订单明细ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getCompanyItemId() {
		return this.companyItemId;
	}
	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
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

	public String getItemTotalAmount() {
		return this.itemTotalAmount;
	}
	public void setItemTotalAmount(String itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}

	public String getItemUnitAmount() {
		return this.itemUnitAmount;
	}
	public void setItemUnitAmount(String itemUnitAmount) {
		this.itemUnitAmount = itemUnitAmount;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
