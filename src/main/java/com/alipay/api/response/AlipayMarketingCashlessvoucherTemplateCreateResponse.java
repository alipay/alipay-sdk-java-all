package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessvoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-23 16:55:09
 */
public class AlipayMarketingCashlessvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1834456519419617472L;

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
