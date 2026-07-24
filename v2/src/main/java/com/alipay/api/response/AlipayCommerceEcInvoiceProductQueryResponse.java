package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 21:42:48
 */
public class AlipayCommerceEcInvoiceProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3826879245632385184L;

	/** 
	 * 平台已发布发票产品列表
	 */
	@ApiListField("invoice_product_list")
	@ApiField("invoice_product_info")
	private List<InvoiceProductInfo> invoiceProductList;

	public void setInvoiceProductList(List<InvoiceProductInfo> invoiceProductList) {
		this.invoiceProductList = invoiceProductList;
	}
	public List<InvoiceProductInfo> getInvoiceProductList( ) {
		return this.invoiceProductList;
	}

}
