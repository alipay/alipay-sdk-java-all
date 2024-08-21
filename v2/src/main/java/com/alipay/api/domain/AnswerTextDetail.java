package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人对话问答返回文本类型详情
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class AnswerTextDetail extends AlipayObject {

	private static final long serialVersionUID = 6198398155217181921L;

	/**
	 * 机器人对话问答返回文本类型内容
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
