package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对话消息体，包含提问内容，附件列表，上下文参数等
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:12:27
 */
public class ChatPayload extends AlipayObject {

	private static final long serialVersionUID = 2429853521335356926L;

	/**
	 * null
	 */
	@ApiListField("attachments")
	@ApiField("file_attachment")
	private List<FileAttachment> attachments;

	/**
	 * 上下文参数，一般用于记忆业务上下文信息的传值。，比如{"uid", "2088"}
	 */
	@ApiField("ctx_params")
	private String ctxParams;

	/**
	 * 提问内容
	 */
	@ApiField("query")
	private String query;

	public List<FileAttachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<FileAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getCtxParams() {
		return this.ctxParams;
	}
	public void setCtxParams(String ctxParams) {
		this.ctxParams = ctxParams;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
