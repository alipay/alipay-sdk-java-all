package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:05
 */
public class AlipaySecurityProdTemplateVersionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3233496461665829949L;

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
