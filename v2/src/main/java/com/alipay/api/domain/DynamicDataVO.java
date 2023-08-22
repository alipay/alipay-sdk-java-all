package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 动态数据VO
 *
 * @author auto create
 * @since 1.0, 2023-04-28 13:56:08
 */
public class DynamicDataVO extends AlipayObject {

	private static final long serialVersionUID = 8779692233697198853L;

	/**
	 * 动态属性列表,列表类型
	 */
	@ApiListField("attribute_list")
	@ApiField("dynamic_attribute_v_o")
	private List<DynamicAttributeVO> attributeList;

	/**
	 * 商品动态数据查询Order，返回时将入参带回
	 */
	@ApiField("order")
	private ItemDynamicQueryOrder order;

	public List<DynamicAttributeVO> getAttributeList() {
		return this.attributeList;
	}
	public void setAttributeList(List<DynamicAttributeVO> attributeList) {
		this.attributeList = attributeList;
	}

	public ItemDynamicQueryOrder getOrder() {
		return this.order;
	}
	public void setOrder(ItemDynamicQueryOrder order) {
		this.order = order;
	}

}
