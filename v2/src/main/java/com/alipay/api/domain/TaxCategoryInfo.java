package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品税收分类编码
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:56
 */
public class TaxCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 3898631378753653374L;

	/**
	 * 参考征收率信息
	 */
	@ApiListField("collection_rate")
	@ApiField("rate_info")
	private List<RateInfo> collectionRate;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品服务分类简称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 父级税编
	 */
	@ApiField("parent_code")
	private String parentCode;

	/**
	 * 特定要素标签
	 */
	@ApiField("specific_element_tag")
	private String specificElementTag;

	/**
	 * 商品税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 参考增值税税率信息
	 */
	@ApiListField("vat_rate")
	@ApiField("rate_info")
	private List<RateInfo> vatRate;

	public List<RateInfo> getCollectionRate() {
		return this.collectionRate;
	}
	public void setCollectionRate(List<RateInfo> collectionRate) {
		this.collectionRate = collectionRate;
	}

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

	public String getSpecificElementTag() {
		return this.specificElementTag;
	}
	public void setSpecificElementTag(String specificElementTag) {
		this.specificElementTag = specificElementTag;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public List<RateInfo> getVatRate() {
		return this.vatRate;
	}
	public void setVatRate(List<RateInfo> vatRate) {
		this.vatRate = vatRate;
	}

}
