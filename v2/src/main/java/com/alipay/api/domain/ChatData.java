package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式问答接口答案内容
 *
 * @author auto create
 * @since 1.0, 2024-08-19 19:58:53
 */
public class ChatData extends AlipayObject {

	private static final long serialVersionUID = 3576939455229773345L;

	/**
	 * 答案的具体内容
	 */
	@ApiField("chunk")
	private ChatChunk chunk;

	/**
	 * 拒识等答案处理，当出现了拒绝识别等回复时候，出该种类型的答案
	 */
	@ApiField("error")
	private ChatError error;

	/**
	 * 答案header信息，当type == header时该字段非空
	 */
	@ApiField("header")
	private ChatHeader header;

	/**
	 * 答案格式,header:第一次返回内容在header字段中，会包含原始问题和请求的requestID；chunk:实际的问答内容，流式进行返回；error:报错的类型返回报错的信息
	 */
	@ApiField("type")
	private String type;

	public ChatChunk getChunk() {
		return this.chunk;
	}
	public void setChunk(ChatChunk chunk) {
		this.chunk = chunk;
	}

	public ChatError getError() {
		return this.error;
	}
	public void setError(ChatError error) {
		this.error = error;
	}

	public ChatHeader getHeader() {
		return this.header;
	}
	public void setHeader(ChatHeader header) {
		this.header = header;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
