package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-08-18 22:03:19
 */
public class ExternalItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5781759965815338967L;

	/**
	 * 类目ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 蚂蚁侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名
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
	 * 图片列表
	 */
	@ApiListField("pic_list")
	@ApiField("external_item_pic")
	private List<ExternalItemPic> picList;

	/**
	 * 类目属性列表
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

	/**
	 * 供应状态
	 */
	@ApiField("status")
	private String status;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public List<ExternalItemPic> getPicList() {
		return this.picList;
	}
	public void setPicList(List<ExternalItemPic> picList) {
		this.picList = picList;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
