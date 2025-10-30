package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式输出结构
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentChatStream extends AlipayObject {

	private static final long serialVersionUID = 7471586692218482786L;

	/**
	 * 输出的具体数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 流式输出类型
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
