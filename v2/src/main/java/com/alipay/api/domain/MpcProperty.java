package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品规则属性，包括propertyName和propertyValue，常用的propertyName值如：“颜色”，“尺码”，“规则”，”内存“
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:18:13
 */
public class MpcProperty extends AlipayObject {

	private static final long serialVersionUID = 7698466446515411929L;

	/**
	 * 属性分类
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 属性值
	 */
	@ApiField("property_value")
	private String propertyValue;

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
