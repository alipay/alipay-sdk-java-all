package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问答推荐部分
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class ChatReference extends AlipayObject {

	private static final long serialVersionUID = 3398181556466498465L;

	/**
	 * 引用内容链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 引用内容title
	 */
	@ApiField("title")
	private String title;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
