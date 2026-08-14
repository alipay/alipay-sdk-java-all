package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目属性值
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:44
 */
public class ExternalCatePropertyValue extends AlipayObject {

	private static final long serialVersionUID = 6551266991942924654L;

	/**
	 * 所属属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

	/**
	 * 属性值别名
	 */
	@ApiField("value_alias")
	private String valueAlias;

	/**
	 * 属性值ID
	 */
	@ApiField("value_id")
	private String valueId;

	/**
	 * 属性值
	 */
	@ApiField("value_name")
	private String valueName;

	public String getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getValueAlias() {
		return this.valueAlias;
	}
	public void setValueAlias(String valueAlias) {
		this.valueAlias = valueAlias;
	}

	public String getValueId() {
		return this.valueId;
	}
	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

	public String getValueName() {
		return this.valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

}
