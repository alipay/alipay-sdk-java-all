package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.template.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:47:37
 */
public class AlipayCommerceTaskTemplatePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534348252871635918L;

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
