package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量分发前修改发票
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:36:12
 */
public class AlipayBossFncInputinvoiceBeforedistributeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5877384485533897554L;

	/**
	 * 批量修改入参
	 */
	@ApiField("input_invoice_batch_modify_open_api_dto")
	private InputInvoiceBatchModifyOpenApiDTO inputInvoiceBatchModifyOpenApiDto;

	public InputInvoiceBatchModifyOpenApiDTO getInputInvoiceBatchModifyOpenApiDto() {
		return this.inputInvoiceBatchModifyOpenApiDto;
	}
	public void setInputInvoiceBatchModifyOpenApiDto(InputInvoiceBatchModifyOpenApiDTO inputInvoiceBatchModifyOpenApiDto) {
		this.inputInvoiceBatchModifyOpenApiDto = inputInvoiceBatchModifyOpenApiDto;
	}

}
