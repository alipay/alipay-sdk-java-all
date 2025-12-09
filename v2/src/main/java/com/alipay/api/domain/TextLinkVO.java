package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文字链接模型
 *
 * @author auto create
 * @since 1.0, 2025-09-11 10:24:33
 */
public class TextLinkVO extends AlipayObject {

	private static final long serialVersionUID = 1594719475638554129L;

	/**
	 * 请输入http、https或alipays开头的链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 字数不超过15个字
	 */
	@ApiField("text")
	private String text;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
