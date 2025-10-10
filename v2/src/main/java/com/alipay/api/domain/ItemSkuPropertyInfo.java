package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品SKU属性模型
 *
 * @author auto create
 * @since 1.0, 2025-09-09 10:41:25
 */
public class ItemSkuPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 6249731414259639237L;

	/**
	 * 属性
	 */
	@ApiField("property_key")
	private String propertyKey;

	/**
	 * 属性值
	 */
	@ApiField("property_value")
	private String propertyValue;

	public String getPropertyKey() {
		return this.propertyKey;
	}
	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
