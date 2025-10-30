package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-16 15:37:29
 */
public class AlipayCloudCloudbaseInvoiceStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2495494543826982232L;

	/** 
	 * 跟踪trace
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 发票信息
	 */
	@ApiField("invoice_data")
	private InvoiceData invoiceData;

	/** 
	 * 消息
	 */
	@ApiField("message")
	private String message;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setInvoiceData(InvoiceData invoiceData) {
		this.invoiceData = invoiceData;
	}
	public InvoiceData getInvoiceData( ) {
		return this.invoiceData;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
