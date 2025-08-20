package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票发起线上勾选
 *
 * @author auto create
 * @since 1.0, 2025-08-07 17:57:56
 */
public class AlipayBossFncInputinvoiceOnlineCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7857218467157898175L;

	/**
	 * 勾选入参
	 */
	@ApiField("input_invoice_certify_open_api_dto")
	private InputInvoiceCertifyOpenApiDTO inputInvoiceCertifyOpenApiDto;

	public InputInvoiceCertifyOpenApiDTO getInputInvoiceCertifyOpenApiDto() {
		return this.inputInvoiceCertifyOpenApiDto;
	}
	public void setInputInvoiceCertifyOpenApiDto(InputInvoiceCertifyOpenApiDTO inputInvoiceCertifyOpenApiDto) {
		this.inputInvoiceCertifyOpenApiDto = inputInvoiceCertifyOpenApiDto;
	}

}
