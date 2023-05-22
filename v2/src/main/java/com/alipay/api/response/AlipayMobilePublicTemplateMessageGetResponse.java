package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.template.message.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:33:08
 */
public class AlipayMobilePublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4465129914326182959L;

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
