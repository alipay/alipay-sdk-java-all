package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票录入登记
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:38:15
 */
public class AlipayBossFncInputinvoiceRegisterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2784439393765299986L;

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
