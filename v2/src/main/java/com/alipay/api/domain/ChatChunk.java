package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式问答chunk部分
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class ChatChunk extends AlipayObject {

	private static final long serialVersionUID = 6469284689716672552L;

	/**
	 * 答案文本
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
