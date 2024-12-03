package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息占位符
 *
 * @author auto create
 * @since 1.0, 2019-10-23 17:03:59
 */
public class TemplateKeyword extends AlipayObject {

	private static final long serialVersionUID = 1662922235811697395L;

	/**
	 * 模板中占位符的颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 模板中占位符的值
	 */
	@ApiField("value")
	private String value;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
