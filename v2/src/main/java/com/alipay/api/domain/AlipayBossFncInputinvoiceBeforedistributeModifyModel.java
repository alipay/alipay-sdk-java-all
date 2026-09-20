package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量分发前修改发票
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:33:18
 */
public class AlipayBossFncInputinvoiceBeforedistributeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7536616193847671974L;

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
