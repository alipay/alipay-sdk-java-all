package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * DataCount
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:06:12
 */
public class DataCount extends AlipayObject {

	private static final long serialVersionUID = 3223462171961283883L;

	/**
	 * 高亮文本
	 */
	@ApiField("highlight_text")
	private String highlightText;

	/**
	 * 文本
	 */
	@ApiField("text")
	private String text;

	public String getHighlightText() {
		return this.highlightText;
	}
	public void setHighlightText(String highlightText) {
		this.highlightText = highlightText;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
