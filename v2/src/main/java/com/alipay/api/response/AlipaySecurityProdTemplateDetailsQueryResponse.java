package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.details.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:54:31
 */
public class AlipaySecurityProdTemplateDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3617381155377263617L;

	/** 
	 * 模板查询结果dto
	 */
	@ApiField("template_dto")
	private TemplateDTO templateDto;

	public void setTemplateDto(TemplateDTO templateDto) {
		this.templateDto = templateDto;
	}
	public TemplateDTO getTemplateDto( ) {
		return this.templateDto;
	}

}
