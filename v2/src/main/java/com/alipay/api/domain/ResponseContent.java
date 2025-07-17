package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 响应结果内容
 *
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:30
 */
public class ResponseContent extends AlipayObject {

	private static final long serialVersionUID = 3713143563572649196L;

	/**
	 * 模型的响应具体内容
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
