package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2026-08-10 11:24:09
 */
public class ExternalItemPropery extends AlipayObject {

	private static final long serialVersionUID = 3313693897341222245L;

	/**
	 * 输入型属性值
	 */
	@ApiField("ext_value")
	private String extValue;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

	/**
	 * 属性值ID
	 */
	@ApiField("value_id")
	private String valueId;

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

	public String getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getValueId() {
		return this.valueId;
	}
	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

}
