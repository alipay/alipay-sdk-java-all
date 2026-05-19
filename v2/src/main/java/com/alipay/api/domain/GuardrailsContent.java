package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-27 13:47:51
 */
public class GuardrailsContent extends AlipayObject {

	private static final long serialVersionUID = 8345251419361145518L;

	/**
	 * 属性code
	 */
	@ApiField("property_code")
	private String propertyCode;

	/**
	 * 内容格式
	 */
	@ApiField("property_format")
	private String propertyFormat;

	/**
	 * 属性值
	 */
	@ApiField("property_value")
	private String propertyValue;

	public String getPropertyCode() {
		return this.propertyCode;
	}
	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}

	public String getPropertyFormat() {
		return this.propertyFormat;
	}
	public void setPropertyFormat(String propertyFormat) {
		this.propertyFormat = propertyFormat;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
