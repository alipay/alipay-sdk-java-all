package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展示文本和对应取值的映射关系
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:26:56
 */
public class Option extends AlipayObject {

	private static final long serialVersionUID = 2673649485993673294L;

	/**
	 * 文本，通常用于理解对应的取值
	 */
	@ApiField("text")
	private String text;

	/**
	 * 取值，通常使用简单的数字或字符串
	 */
	@ApiField("value")
	private String value;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
