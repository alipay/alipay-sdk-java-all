package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板占位信息
 *
 * @author auto create
 * @since 1.0, 2021-12-02 11:11:35
 */
public class TemplatePlaceholderDTO extends AlipayObject {

	private static final long serialVersionUID = 7411227287719286762L;

	/**
	 * 占位符的名称
	 */
	@ApiField("placeholder_key")
	private String placeholderKey;

	/**
	 * 占位符的值
	 */
	@ApiField("placeholder_value")
	private String placeholderValue;

	public String getPlaceholderKey() {
		return this.placeholderKey;
	}
	public void setPlaceholderKey(String placeholderKey) {
		this.placeholderKey = placeholderKey;
	}

	public String getPlaceholderValue() {
		return this.placeholderValue;
	}
	public void setPlaceholderValue(String placeholderValue) {
		this.placeholderValue = placeholderValue;
	}

}
