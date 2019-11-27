package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家的服务属性信息
 *
 * @author auto create
 * @since 1.0, 2016-12-21 15:35:15
 */
public class ServicePropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 2726722985794557438L;

	/**
	 * 属性序号，从0开始
	 */
	@ApiField("property_index")
	private Long propertyIndex;

	/**
	 * 服务的属性名
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 属性值列表
	 */
	@ApiListField("property_value")
	@ApiField("property_value")
	private List<PropertyValue> propertyValue;

	public Long getPropertyIndex() {
		return this.propertyIndex;
	}
	public void setPropertyIndex(Long propertyIndex) {
		this.propertyIndex = propertyIndex;
	}

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public List<PropertyValue> getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(List<PropertyValue> propertyValue) {
		this.propertyValue = propertyValue;
	}

}
