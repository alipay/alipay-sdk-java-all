package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本和来源
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:14:08
 */
public class TextSource extends AlipayObject {

	private static final long serialVersionUID = 1143819166851487776L;

	/**
	 * 文本来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 文本信息
	 */
	@ApiField("text")
	private String text;

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
