package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车表格信息
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:04:10
 */
public class RentCarTableInfo extends AlipayObject {

	private static final long serialVersionUID = 2426424818771896849L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容是否强调展示
	 */
	@ApiField("great")
	private Boolean great;

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

	public Boolean getGreat() {
		return this.great;
	}
	public void setGreat(Boolean great) {
		this.great = great;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
