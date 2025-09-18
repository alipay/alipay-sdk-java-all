package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateElementLinkDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.component.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:56
 */
public class AlipaySecurityProdTemplateComponentGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621679896774545366L;

	/** 
	 * 模板创建结果
	 */
	@ApiField("template_element_link_dto")
	private TemplateElementLinkDTO templateElementLinkDto;

	public void setTemplateElementLinkDto(TemplateElementLinkDTO templateElementLinkDto) {
		this.templateElementLinkDto = templateElementLinkDto;
	}
	public TemplateElementLinkDTO getTemplateElementLinkDto( ) {
		return this.templateElementLinkDto;
	}

}
