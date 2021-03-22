package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-02 11:18:22
 */
public class AlipayOpenPublicTemplateMessageAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3761551653129916581L;

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
