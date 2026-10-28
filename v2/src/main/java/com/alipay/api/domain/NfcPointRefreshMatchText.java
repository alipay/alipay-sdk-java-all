package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进度匹配文案
 *
 * @author auto create
 * @since 1.0, 2026-10-14 11:22:57
 */
public class NfcPointRefreshMatchText extends AlipayObject {

	private static final long serialVersionUID = 3134376255418655642L;

	/**
	 * 当前进度命中的文案
	 */
	@ApiField("text")
	private String text;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
