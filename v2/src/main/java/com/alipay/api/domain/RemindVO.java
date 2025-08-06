package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息参数
 *
 * @author auto create
 * @since 1.0, 2024-12-26 20:55:58
 */
public class RemindVO extends AlipayObject {

	private static final long serialVersionUID = 4645311547942111288L;

	/**
	 * 提醒内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 提醒名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 提醒标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
