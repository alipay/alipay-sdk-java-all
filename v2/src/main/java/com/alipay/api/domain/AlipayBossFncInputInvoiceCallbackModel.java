package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票回调接口
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:33:30
 */
public class AlipayBossFncInputInvoiceCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 7444917776661962556L;

	/**
	 * 请求入参
	 */
	@ApiField("input_invoice_callback_open_api_order")
	private InputInvoiceCallbackOpenApiOrder inputInvoiceCallbackOpenApiOrder;

	public InputInvoiceCallbackOpenApiOrder getInputInvoiceCallbackOpenApiOrder() {
		return this.inputInvoiceCallbackOpenApiOrder;
	}
	public void setInputInvoiceCallbackOpenApiOrder(InputInvoiceCallbackOpenApiOrder inputInvoiceCallbackOpenApiOrder) {
		this.inputInvoiceCallbackOpenApiOrder = inputInvoiceCallbackOpenApiOrder;
	}

}
