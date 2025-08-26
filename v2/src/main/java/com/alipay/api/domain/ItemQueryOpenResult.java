package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询商品信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:20
 */
public class ItemQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 7884297869991586654L;

	/**
	 * 商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 商品类目名称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 外部供应商ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品税收分类编码
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

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
