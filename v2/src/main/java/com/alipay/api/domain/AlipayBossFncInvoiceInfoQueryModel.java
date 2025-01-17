package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过ouCode查询开票信息
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:40:00
 */
public class AlipayBossFncInvoiceInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4539873183935323983L;

	/**
	 * 查询入参
	 */
	@ApiField("query_invoice_info_by_ou_open_api_dto")
	private QueryInvoiceInfoByOuOpenApiDTO queryInvoiceInfoByOuOpenApiDto;

	public QueryInvoiceInfoByOuOpenApiDTO getQueryInvoiceInfoByOuOpenApiDto() {
		return this.queryInvoiceInfoByOuOpenApiDto;
	}
	public void setQueryInvoiceInfoByOuOpenApiDto(QueryInvoiceInfoByOuOpenApiDTO queryInvoiceInfoByOuOpenApiDto) {
		this.queryInvoiceInfoByOuOpenApiDto = queryInvoiceInfoByOuOpenApiDto;
	}

}
