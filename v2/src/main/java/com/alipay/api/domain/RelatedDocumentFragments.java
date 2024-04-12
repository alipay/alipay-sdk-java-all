package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 相关的文档片段
 *
 * @author auto create
 * @since 1.0, 2024-01-16 10:33:08
 */
public class RelatedDocumentFragments extends AlipayObject {

	private static final long serialVersionUID = 2179575544441667354L;

	/**
	 * 文档片段内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 文档片段标题
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
