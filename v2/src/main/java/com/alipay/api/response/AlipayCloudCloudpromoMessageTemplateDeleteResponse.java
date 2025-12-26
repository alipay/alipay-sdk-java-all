package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.template.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-22 15:26:57
 */
public class AlipayCloudCloudpromoMessageTemplateDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6826559573259526315L;

	/** 
	 * 短信模板Code
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
