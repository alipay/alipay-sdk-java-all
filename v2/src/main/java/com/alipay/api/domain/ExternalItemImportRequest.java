package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品录入请求
 *
 * @author auto create
 * @since 1.0, 2026-08-10 11:24:09
 */
public class ExternalItemImportRequest extends AlipayObject {

	private static final long serialVersionUID = 6797554215456765554L;

	/**
	 * 类目ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 标签id列表
	 */
	@ApiListField("label_id_list")
	@ApiField("string")
	private List<String> labelIdList;

	/**
	 * 商品图片列表 当前字段已废弃(字段类型录错了，录入时图片列表用新字段picture_list)
	 */
	@ApiListField("pic_list")
	@ApiField("string")
	@Deprecated
	private List<String> picList;

	/**
	 * 图片列表
	 */
	@ApiListField("picture_list")
	@ApiField("external_item_pic")
	private List<ExternalItemPic> pictureList;

	/**
	 * 商品属性列表
	 */
	@ApiListField("property_list")
	@ApiField("external_item_propery")
	private List<ExternalItemPropery> propertyList;

	/**
	 * 销售规则列表
	 */
	@ApiListField("sale_rule_list")
	@ApiField("external_sale_rule")
	private List<ExternalSaleRule> saleRuleList;

	/**
	 * 服务产品ID
	 */
	@ApiField("ser_prod_no")
	private String serProdNo;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("external_s_k_u")
	private List<ExternalSKU> skuList;

	/**
	 * 商家商品Id
	 */
	@ApiField("source_product_id")
	private String sourceProductId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public List<String> getLabelIdList() {
		return this.labelIdList;
	}
	public void setLabelIdList(List<String> labelIdList) {
		this.labelIdList = labelIdList;
	}

	public List<String> getPicList() {
		return this.picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

	public List<ExternalItemPic> getPictureList() {
		return this.pictureList;
	}
	public void setPictureList(List<ExternalItemPic> pictureList) {
		this.pictureList = pictureList;
	}

	public List<ExternalItemPropery> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<ExternalItemPropery> propertyList) {
		this.propertyList = propertyList;
	}

	public List<ExternalSaleRule> getSaleRuleList() {
		return this.saleRuleList;
	}
	public void setSaleRuleList(List<ExternalSaleRule> saleRuleList) {
		this.saleRuleList = saleRuleList;
	}

	public String getSerProdNo() {
		return this.serProdNo;
	}
	public void setSerProdNo(String serProdNo) {
		this.serProdNo = serProdNo;
	}

	public List<ExternalSKU> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<ExternalSKU> skuList) {
		this.skuList = skuList;
	}

	public String getSourceProductId() {
		return this.sourceProductId;
	}
	public void setSourceProductId(String sourceProductId) {
		this.sourceProductId = sourceProductId;
	}

}
