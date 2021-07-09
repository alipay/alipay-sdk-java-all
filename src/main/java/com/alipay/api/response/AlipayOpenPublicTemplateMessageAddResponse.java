package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-26 10:07:34
 */
public class AlipayOpenPublicTemplateMessageAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7162355936924632725L;

	/** 
	 * 模板消息的详细信息
	 */
	@ApiField("template")
	private String template;

	/** 
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplate( ) {
		return this.template;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
