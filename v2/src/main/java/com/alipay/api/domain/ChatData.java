package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式问答接口答案内容
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:57:09
 */
public class ChatData extends AlipayObject {

	private static final long serialVersionUID = 3782665518858433334L;

	/**
	 * 答案的具体内容
	 */
	@ApiField("chunk")
	private ChatChunk chunk;

	/**
	 * 问答处理报错
	 */
	@ApiField("error")
	private ChatError error;

	/**
	 * 答案header信息，当type == header时该字段非空
	 */
	@ApiField("header")
	private ChatHeader header;

	/**
	 * 答案类型
当type == header时，展示header内容
当type == chunk时，展示chunk内容
当type == error时，展示error内容
当type == revoke时，展示revoke内容
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
