package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-14 11:11:29
 */
public class AlipayMarketingCardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3788279334673146451L;

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
