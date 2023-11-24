package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板
 *
 * @author auto create
 * @since 1.0, 2019-11-25 10:10:29
 */
public class MessageTemplate extends AlipayObject {

	private static final long serialVersionUID = 8562927671758346745L;

	/**
	 * 消息主体
	 */
	@ApiField("context")
	private MessageContext context;

	/**
	 * 消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public MessageContext getContext() {
		return this.context;
	}
	public void setContext(MessageContext context) {
		this.context = context;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
