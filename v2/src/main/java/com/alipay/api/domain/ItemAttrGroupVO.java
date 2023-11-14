package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性分组
 *
 * @author auto create
 * @since 1.0, 2023-07-12 10:24:17
 */
public class ItemAttrGroupVO extends AlipayObject {

	private static final long serialVersionUID = 1864642797531113351L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("item_attr_list")
	@ApiField("attribute_v_o")
	private List<AttributeVO> itemAttrList;

	/**
	 * 商品属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用item_attr_list替换)
	 */
	@ApiListField("product_attr_list")
	@ApiField("attribute_v_o")
	@Deprecated
	private List<AttributeVO> productAttrList;

	/**
	 * 销售属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用sku_attr_list替换)
	 */
	@ApiListField("sale_attr_list")
	@ApiField("attribute_v_o")
	@Deprecated
	private List<AttributeVO> saleAttrList;

	/**
	 * SKU属性列表
	 */
	@ApiListField("sku_attr_list")
	@ApiField("attribute_v_o")
	private List<AttributeVO> skuAttrList;

	public List<AttributeVO> getItemAttrList() {
		return this.itemAttrList;
	}
	public void setItemAttrList(List<AttributeVO> itemAttrList) {
		this.itemAttrList = itemAttrList;
	}

	public List<AttributeVO> getProductAttrList() {
		return this.productAttrList;
	}
	public void setProductAttrList(List<AttributeVO> productAttrList) {
		this.productAttrList = productAttrList;
	}

	public List<AttributeVO> getSaleAttrList() {
		return this.saleAttrList;
	}
	public void setSaleAttrList(List<AttributeVO> saleAttrList) {
		this.saleAttrList = saleAttrList;
	}

	public List<AttributeVO> getSkuAttrList() {
		return this.skuAttrList;
	}
	public void setSkuAttrList(List<AttributeVO> skuAttrList) {
		this.skuAttrList = skuAttrList;
	}

}
