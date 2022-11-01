package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 14:10:37
 */
public class ZhimaCreditPeZmgoTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736229398456894258L;

	/** 
	 * 模板id，创建成功有值
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
