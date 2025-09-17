package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调用AI返回的流式消息结构细节
 *
 * @author auto create
 * @since 1.0, 2024-12-11 17:00:19
 */
public class HdfCompletionChunk extends AlipayObject {

	private static final long serialVersionUID = 5531921565442393231L;

	/**
	 * 载荷的具体内容结构，JSON。
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 消息结构的细节类型
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
