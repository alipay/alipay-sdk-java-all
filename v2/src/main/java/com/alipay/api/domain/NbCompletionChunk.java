package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调用nextBuilder的生成型应用返回的流式消息结构细节
 *
 * @author auto create
 * @since 1.0, 2024-05-15 11:46:14
 */
public class NbCompletionChunk extends AlipayObject {

	private static final long serialVersionUID = 2512824137717477875L;

	/**
	 * 载荷的具体内容结构，JSON。具体内容参考文档：<a href="https://opendocs.alipay.com/pre-open/0cbosj?pathHash=65a79d8d">链接文本</a>
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 消息结构的细节类型，具体内容参考文档：<a href="https://opendocs.alipay.com/pre-open/0c5two">链接文本</a>
	 */
	@ApiField("type")
	private String type;

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
