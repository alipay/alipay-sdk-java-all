package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本内容类型
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class TextDetail extends AlipayObject {

	private static final long serialVersionUID = 2893344267169558669L;

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
