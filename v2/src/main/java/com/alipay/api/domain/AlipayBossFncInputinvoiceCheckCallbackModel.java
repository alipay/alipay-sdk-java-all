package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票验真通知回调
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:37:52
 */
public class AlipayBossFncInputinvoiceCheckCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 1396153133486982796L;

	/**
	 * 验真回调入参
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
