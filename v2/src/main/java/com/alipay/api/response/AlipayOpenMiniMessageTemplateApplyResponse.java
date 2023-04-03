package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.message.template.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:21:43
 */
public class AlipayOpenMiniMessageTemplateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1425525936317539285L;

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
