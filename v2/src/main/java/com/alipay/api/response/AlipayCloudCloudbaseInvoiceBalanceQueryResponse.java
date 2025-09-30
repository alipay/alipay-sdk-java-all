package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceAmountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 10:47:30
 */
public class AlipayCloudCloudbaseInvoiceBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1454492283754993618L;

	/** 
	 * 跟踪trace
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 可开票金额信息
	 */
	@ApiField("invoice_amount_info")
	private InvoiceAmountInfo invoiceAmountInfo;

	/** 
	 * 信息
	 */
	@ApiField("message")
	private String message;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setInvoiceAmountInfo(InvoiceAmountInfo invoiceAmountInfo) {
		this.invoiceAmountInfo = invoiceAmountInfo;
	}
	public InvoiceAmountInfo getInvoiceAmountInfo( ) {
		return this.invoiceAmountInfo;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
