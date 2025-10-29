package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeqiInvoiceClerk;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.clerk.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-09 17:37:39
 */
public class AlipayCommerceEcInvoiceClerkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6478869985948534587L;

	/** 
	 * 开票员列表
	 */
	@ApiListField("invoice_clerk_list")
	@ApiField("leqi_invoice_clerk")
	private List<LeqiInvoiceClerk> invoiceClerkList;

	public void setInvoiceClerkList(List<LeqiInvoiceClerk> invoiceClerkList) {
		this.invoiceClerkList = invoiceClerkList;
	}
	public List<LeqiInvoiceClerk> getInvoiceClerkList( ) {
		return this.invoiceClerkList;
	}

}
