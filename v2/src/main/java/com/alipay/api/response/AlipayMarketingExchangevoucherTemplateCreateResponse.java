package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:46:58
 */
public class AlipayMarketingExchangevoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7647541624823699115L;

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
