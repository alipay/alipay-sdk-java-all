package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发者模板的关键词
 *
 * @author auto create
 * @since 1.0, 2018-01-16 20:57:32
 */
public class UserTemplateKeyword extends AlipayObject {

	private static final long serialVersionUID = 1316672891712364632L;

	/**
	 * 关键词的示例词
	 */
	@ApiField("example")
	private String example;

	/**
	 * 用户模板的站位符
	 */
	@ApiField("placeholder")
	private String placeholder;

	/**
	 * 关键词的标题
	 */
	@ApiField("title")
	private String title;

	public String getExample() {
		return this.example;
	}
	public void setExample(String example) {
		this.example = example;
	}

	public String getPlaceholder() {
		return this.placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
