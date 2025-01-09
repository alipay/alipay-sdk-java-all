package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.details.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:04
 */
public class AlipaySecurityProdTemplateDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7588445788995198774L;

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
