package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 从百灵查询文案的返回值子对象
 *
 * @author auto create
 * @since 1.0, 2026-03-24 14:10:21
 */
public class TextLanguageDTO extends AlipayObject {

	private static final long serialVersionUID = 2274523962816367583L;

	/**
	 * 文案
	 */
	@ApiField("content")
	private String content;

	/**
	 * 语种
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
