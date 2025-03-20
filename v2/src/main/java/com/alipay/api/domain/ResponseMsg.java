package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模型的响应结果，由响应结果类型和具体的响应内容组成。
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:30
 */
public class ResponseMsg extends AlipayObject {

	private static final long serialVersionUID = 1459752913582458956L;

	/**
	 * 响应结果的具体内容，结构由 type 控制
	 */
	@ApiField("content")
	private ResponseContent content;

	/**
	 * 响应结果的具体类型，控制 content 字段的具体结构。
	 */
	@ApiField("type")
	private String type;

	public ResponseContent getContent() {
		return this.content;
	}
	public void setContent(ResponseContent content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
