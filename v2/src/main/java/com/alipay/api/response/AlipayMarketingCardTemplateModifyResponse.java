package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:07:05
 */
public class AlipayMarketingCardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524788171931318137L;

	/** 
	 * 模板ID
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
