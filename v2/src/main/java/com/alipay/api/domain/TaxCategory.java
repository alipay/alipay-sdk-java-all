package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税收分类信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:16
 */
public class TaxCategory extends AlipayObject {

	private static final long serialVersionUID = 1486195738512519926L;

	/**
	 * 对于该商品或服务的说明
	 */
	@ApiField("description")
	private String description;

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
	 * 商品所属父级编码
	 */
	@ApiField("parent_code")
	private String parentCode;

	/**
	 * 企业税收分类编码，可在税收分类编码分页查询中根据产品ID获取对应税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
