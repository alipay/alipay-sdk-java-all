package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本内容类型
 *
 * @author auto create
 * @since 1.0, 2023-12-01 13:56:56
 */
public class TextDetail extends AlipayObject {

	private static final long serialVersionUID = 6675375198468563466L;

	/**
	 * 文本类型内容
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
