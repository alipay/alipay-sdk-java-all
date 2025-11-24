package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 10:52:43
 */
public class AlipayFundWalletTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1312278828271379513L;

	/** 
	 * 钱包模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 钱包模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName( ) {
		return this.templateName;
	}

}
