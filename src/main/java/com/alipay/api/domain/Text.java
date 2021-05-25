package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息内容
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:27:10
 */
public class Text extends AlipayObject {

	private static final long serialVersionUID = 2259519656235657629L;

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
