package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 20:27:42
 */
public class AlipayOpenPublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3158451891714442652L;

	/** 
	 * 消息模板id--商户领取母版后生成的唯一模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/** 
	 * 模板内容
	 */
	@ApiField("template")
	private String template;

	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}
	public String getMsgTemplateId( ) {
		return this.msgTemplateId;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplate( ) {
		return this.template;
	}

}
