package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板数据
 *
 * @author auto create
 * @since 1.0, 2024-12-23 17:37:55
 */
public class TemplateData extends AlipayObject {

	private static final long serialVersionUID = 1519785288628969991L;

	/**
	 * 返回预期页面的数据
	 */
	@ApiField("content")
	private String content;

	/**
	 * 卡片id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 卡片的标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
