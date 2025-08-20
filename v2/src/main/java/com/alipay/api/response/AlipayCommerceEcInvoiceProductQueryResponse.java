package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 13:47:27
 */
public class AlipayCommerceEcInvoiceProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7643866833384245637L;

	/** 
	 * 平台已发布发票产品列表
	 */
	@ApiField("invoice_product_list")
	private InvoiceProductInfo invoiceProductList;

	public void setInvoiceProductList(InvoiceProductInfo invoiceProductList) {
		this.invoiceProductList = invoiceProductList;
	}
	public InvoiceProductInfo getInvoiceProductList( ) {
		return this.invoiceProductList;
	}

}
