package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaybillInvoiceQueryIstd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.invoice.istdwaybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 15:59:12
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8351912318993239746L;

	/** 
	 * 整体的运单开票状态，0：处理中 1：开票成功 2：开票失败
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 即时配送运单列表
	 */
	@ApiListField("waybill_invoices")
	@ApiField("waybill_invoice_query_istd")
	private List<WaybillInvoiceQueryIstd> waybillInvoices;

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setWaybillInvoices(List<WaybillInvoiceQueryIstd> waybillInvoices) {
		this.waybillInvoices = waybillInvoices;
	}
	public List<WaybillInvoiceQueryIstd> getWaybillInvoices( ) {
		return this.waybillInvoices;
	}

}
