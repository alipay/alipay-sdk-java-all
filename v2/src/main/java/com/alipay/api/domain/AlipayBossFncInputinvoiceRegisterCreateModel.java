package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票录入登记
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:39:37
 */
public class AlipayBossFncInputinvoiceRegisterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8654313155889785911L;

	/**
	 * 发票登记入参
	 */
	@ApiField("input_invoice_register_open_api_dto")
	private InputInvoiceRegisterOpenApiDTO inputInvoiceRegisterOpenApiDto;

	public InputInvoiceRegisterOpenApiDTO getInputInvoiceRegisterOpenApiDto() {
		return this.inputInvoiceRegisterOpenApiDto;
	}
	public void setInputInvoiceRegisterOpenApiDto(InputInvoiceRegisterOpenApiDTO inputInvoiceRegisterOpenApiDto) {
		this.inputInvoiceRegisterOpenApiDto = inputInvoiceRegisterOpenApiDto;
	}

}
