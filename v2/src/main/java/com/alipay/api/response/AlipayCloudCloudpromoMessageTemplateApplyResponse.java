package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.template.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-06 11:36:57
 */
public class AlipayCloudCloudpromoMessageTemplateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6728114666191754416L;

	/** 
	 * 短信模板Code。人工审核通过后，该模板才能用于发送短信。
	 */
	@ApiField("template_code")
	private String templateCode;

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

}
