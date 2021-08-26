package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessticket.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-09 11:10:27
 */
public class AlipayMarketingCashlessticketTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7433727788459926513L;

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
