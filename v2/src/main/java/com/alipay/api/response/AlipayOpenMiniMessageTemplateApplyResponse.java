package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.message.template.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 11:45:50
 */
public class AlipayOpenMiniMessageTemplateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7118877967131856624L;

	/** 
	 * 消息模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
