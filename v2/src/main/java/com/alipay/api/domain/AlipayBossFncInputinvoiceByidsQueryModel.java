package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据id查询发票
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:52:13
 */
public class AlipayBossFncInputinvoiceByidsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7294425244112191293L;

	/**
	 * 发票查询入参
	 */
	@ApiField("input_invoice_query_by_ids_open_api_dto")
	private InputInvoiceQueryByIdsOpenApiDTO inputInvoiceQueryByIdsOpenApiDto;

	public InputInvoiceQueryByIdsOpenApiDTO getInputInvoiceQueryByIdsOpenApiDto() {
		return this.inputInvoiceQueryByIdsOpenApiDto;
	}
	public void setInputInvoiceQueryByIdsOpenApiDto(InputInvoiceQueryByIdsOpenApiDTO inputInvoiceQueryByIdsOpenApiDto) {
		this.inputInvoiceQueryByIdsOpenApiDto = inputInvoiceQueryByIdsOpenApiDto;
	}

}
