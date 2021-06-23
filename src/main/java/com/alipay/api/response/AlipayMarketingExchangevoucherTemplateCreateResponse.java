package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-22 18:07:43
 */
public class AlipayMarketingExchangevoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1611497769662144563L;

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
