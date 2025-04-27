package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaybillInvoiceIstd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.invoice.istdwaybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 10:39:37
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2693169226277355992L;

	/** 
	 * 开票金额
	 */
	@ApiField("invoice_fee")
	private String invoiceFee;

	/** 
	 * 整体的运单开票状态，0：处理中 1：开票成功 2：开票失败
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 即时配送运单列表
	 */
	@ApiListField("waybill_invoices")
	@ApiField("waybill_invoice_istd")
	private List<WaybillInvoiceIstd> waybillInvoices;

	public void setInvoiceFee(String invoiceFee) {
		this.invoiceFee = invoiceFee;
	}
	public String getInvoiceFee( ) {
		return this.invoiceFee;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setWaybillInvoices(List<WaybillInvoiceIstd> waybillInvoices) {
		this.waybillInvoices = waybillInvoices;
	}
	public List<WaybillInvoiceIstd> getWaybillInvoices( ) {
		return this.waybillInvoices;
	}

}
