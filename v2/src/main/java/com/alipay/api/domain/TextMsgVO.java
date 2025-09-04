package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息模型
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:58:09
 */
public class TextMsgVO extends AlipayObject {

	private static final long serialVersionUID = 5217215927844426457L;

	/**
	 * 文本消息内容
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
