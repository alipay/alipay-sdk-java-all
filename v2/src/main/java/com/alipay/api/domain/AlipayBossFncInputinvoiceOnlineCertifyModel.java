package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票发起线上勾选
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:36:55
 */
public class AlipayBossFncInputinvoiceOnlineCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7581296977895492693L;

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
