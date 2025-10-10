package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票订单创建订单明细
 *
 * @author auto create
 * @since 1.0, 2025-05-15 17:38:21
 */
public class RecyclinginvoiceOrderCreateItem extends AlipayObject {

	private static final long serialVersionUID = 7349668444971476432L;

	/**
	 * 商品ID，传值为新增商品接口返回的商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

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
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 金额（元，整数最长七位，小数最长两位）
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价（元，整数最长七位，小数最长六位）
	 */
	@ApiField("item_unit_amount")
	private String itemUnitAmount;

	/**
	 * 税收分类编码，根据税务机关编制的税收分类编码表传值
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getCompanyItemId() {
		return this.companyItemId;
	}
	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
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

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
