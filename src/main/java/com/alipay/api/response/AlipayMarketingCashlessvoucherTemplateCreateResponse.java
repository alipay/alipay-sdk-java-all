package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessvoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 14:26:43
 */
public class AlipayMarketingCashlessvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2223113583725244542L;

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
