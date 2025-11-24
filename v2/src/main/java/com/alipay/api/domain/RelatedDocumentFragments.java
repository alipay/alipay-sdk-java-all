package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 相关的文档片段
 *
 * @author auto create
 * @since 1.0, 2025-11-03 11:08:29
 */
public class RelatedDocumentFragments extends AlipayObject {

	private static final long serialVersionUID = 7323319442988776934L;

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
