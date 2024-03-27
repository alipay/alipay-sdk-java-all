package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-06 11:41:58
 */
public class AlipayCloudCloudpromoMessageTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8477522966596897974L;

	/** 
	 * 短信模板Code。
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
