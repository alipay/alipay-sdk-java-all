package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-29 17:24:01
 */
public class ZhimaCreditPeZmgoTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198274554645165383L;

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
