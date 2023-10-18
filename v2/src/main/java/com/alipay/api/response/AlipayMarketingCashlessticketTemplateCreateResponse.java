package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessticket.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 11:34:35
 */
public class AlipayMarketingCashlessticketTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8634964969279529267L;

	/** 
	 * 票模板id
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
