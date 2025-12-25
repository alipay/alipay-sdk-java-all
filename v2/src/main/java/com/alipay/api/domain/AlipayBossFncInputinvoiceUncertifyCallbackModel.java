package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票反勾选回调
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:37:08
 */
public class AlipayBossFncInputinvoiceUncertifyCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4797891415937441778L;

	/**
	 * 反勾选回调入参
	 */
	@ApiField("input_invoice_callback_open_api_dto")
	private InputInvoiceCallbackOpenApiDTO inputInvoiceCallbackOpenApiDto;

	public InputInvoiceCallbackOpenApiDTO getInputInvoiceCallbackOpenApiDto() {
		return this.inputInvoiceCallbackOpenApiDto;
	}
	public void setInputInvoiceCallbackOpenApiDto(InputInvoiceCallbackOpenApiDTO inputInvoiceCallbackOpenApiDto) {
		this.inputInvoiceCallbackOpenApiDto = inputInvoiceCallbackOpenApiDto;
	}

}
