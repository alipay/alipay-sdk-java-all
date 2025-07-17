package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateVersionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:53:44
 */
public class AlipaySecurityProdTemplateVersionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3427133774757859413L;

	/** 
	 * 模板版本查询返回结果
	 */
	@ApiField("template_version_dto")
	private TemplateVersionDTO templateVersionDto;

	public void setTemplateVersionDto(TemplateVersionDTO templateVersionDto) {
		this.templateVersionDto = templateVersionDto;
	}
	public TemplateVersionDTO getTemplateVersionDto( ) {
		return this.templateVersionDto;
	}

}
