package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:25
 */
public class AlipaySecurityProdTemplateVersionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1776978274615367469L;

	/** 
	 * 分页查询结果
	 */
	@ApiField("page_dto")
	private PageDTO pageDto;

	public void setPageDto(PageDTO pageDto) {
		this.pageDto = pageDto;
	}
	public PageDTO getPageDto( ) {
		return this.pageDto;
	}

}
