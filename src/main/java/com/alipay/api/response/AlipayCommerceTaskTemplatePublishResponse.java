package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.template.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-30 14:54:17
 */
public class AlipayCommerceTaskTemplatePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1212243399894593541L;

	/** 
	 * 任务模版
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
