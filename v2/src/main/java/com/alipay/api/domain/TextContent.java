package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纯文字消息内容
 *
 * @author auto create
 * @since 1.0, 2020-06-30 19:22:11
 */
public class TextContent extends AlipayObject {

	private static final long serialVersionUID = 4727446286472216572L;

	/**
	 * 文本消息的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 文本消息的标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
