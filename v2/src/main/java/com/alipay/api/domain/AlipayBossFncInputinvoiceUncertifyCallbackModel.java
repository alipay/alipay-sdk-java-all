package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票反勾选回调
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:33:55
 */
public class AlipayBossFncInputinvoiceUncertifyCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 2754134453254675847L;

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
