package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文案的语言和内容
 *
 * @author auto create
 * @since 1.0, 2026-03-24 14:10:08
 */
public class TextLanguageReq extends AlipayObject {

	private static final long serialVersionUID = 2578869657191232881L;

	/**
	 * 文案
	 */
	@ApiField("content")
	private String content;

	/**
	 * zh-CN
	 */
	@ApiField("locale")
	private String locale;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getLocale() {
		return this.locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

}
