package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票分发消息回调
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:36:46
 */
public class AlipayBossFncInputinvoiceDistributeCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 8585144288567152478L;

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
