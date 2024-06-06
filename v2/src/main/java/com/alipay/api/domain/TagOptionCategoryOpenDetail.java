package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签值详情
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:18:06
 */
public class TagOptionCategoryOpenDetail extends AlipayObject {

	private static final long serialVersionUID = 2839251534489135485L;

	/**
	 * 标签中文名称
	 */
	@ApiField("text")
	private String text;

	/**
	 * 标签值
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
