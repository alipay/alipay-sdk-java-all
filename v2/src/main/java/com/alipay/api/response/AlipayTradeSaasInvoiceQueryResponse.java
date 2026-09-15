package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.invoice.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 11:42:49
 */
public class AlipayTradeSaasInvoiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7215425356356335435L;

	/** 
	 * 发票详细信息
	 */
	@ApiField("invoice_detail_info")
	private InvoiceDetailInfo invoiceDetailInfo;

	public void setInvoiceDetailInfo(InvoiceDetailInfo invoiceDetailInfo) {
		this.invoiceDetailInfo = invoiceDetailInfo;
	}
	public InvoiceDetailInfo getInvoiceDetailInfo( ) {
		return this.invoiceDetailInfo;
	}

}
