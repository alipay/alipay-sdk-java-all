package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceModelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:51:55
 */
public class AlipayEbppInvoiceInfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457391983226119619L;

	/** 
	 * 电子发票详情模型
	 */
	@ApiField("invoice_model")
	private InvoiceModelContent invoiceModel;

	public void setInvoiceModel(InvoiceModelContent invoiceModel) {
		this.invoiceModel = invoiceModel;
	}
	public InvoiceModelContent getInvoiceModel( ) {
		return this.invoiceModel;
	}

}
