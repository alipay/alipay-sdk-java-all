package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品介绍
 *
 * @author auto create
 * @since 1.0, 2024-07-11 13:25:28
 */
public class ItemIntroduction extends AlipayObject {

	private static final long serialVersionUID = 1399231819426366961L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 标题
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
