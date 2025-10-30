package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 相关的文档片段
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class RelatedDocumentFragments extends AlipayObject {

	private static final long serialVersionUID = 8198125684488599774L;

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
