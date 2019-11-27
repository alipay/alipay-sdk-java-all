package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.financial.blockchain.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 16:50:09
 */
public class AlipayEbppInvoiceFinancialBlockchainBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418875883644786969L;

	/** 
	 * 发票列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}
	public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

}
