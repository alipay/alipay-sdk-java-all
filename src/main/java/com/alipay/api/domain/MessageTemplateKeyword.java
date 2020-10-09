package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
 *
 * @author auto create
 * @since 1.0, 2019-11-15 16:58:59
 */
public class MessageTemplateKeyword extends AlipayObject {

	private static final long serialVersionUID = 3468318379349192125L;

	/**
	 * 颜色
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
