package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性分组
 *
 * @author auto create
 * @since 1.0, 2023-04-25 11:52:40
 */
public class ItemAttrGroupVO extends AlipayObject {

	private static final long serialVersionUID = 7868465555959467963L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("product_attr_list")
	@ApiField("attribute_v_o")
	private List<AttributeVO> productAttrList;

	/**
	 * 销售属性列表
	 */
	@ApiListField("sale_attr_list")
	@ApiField("attribute_v_o")
	private List<AttributeVO> saleAttrList;

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

}
