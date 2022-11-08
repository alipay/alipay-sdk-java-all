package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性模型
 *
 * @author auto create
 * @since 1.0, 2019-09-11 16:08:48
 */
public class ItemPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 4743938363974877334L;

	/**
	 * 属性名称
	 */
	@ApiField("property_key")
	private String propertyKey;

	/**
	 * 属性值列表
	 */
	@ApiListField("property_value_list")
	@ApiField("string")
	private List<String> propertyValueList;

	public String getPropertyKey() {
		return this.propertyKey;
	}
	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public List<String> getPropertyValueList() {
		return this.propertyValueList;
	}
	public void setPropertyValueList(List<String> propertyValueList) {
		this.propertyValueList = propertyValueList;
	}

}
