package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票分发消息回调
 *
 * @author auto create
 * @since 1.0, 2025-08-07 17:57:09
 */
public class AlipayBossFncInputinvoiceDistributeCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4541971653876218857L;

	/**
	 * 回调入参
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
