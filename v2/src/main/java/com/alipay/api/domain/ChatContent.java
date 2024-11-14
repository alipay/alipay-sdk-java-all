package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聊天消息具体内容
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:19
 */
public class ChatContent extends AlipayObject {

	private static final long serialVersionUID = 3791692664937122355L;

	/**
	 * 用户的意图问题
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
