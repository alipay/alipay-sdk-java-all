package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryInvoiceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-16 15:42:28
 */
public class AlipayCloudCloudbaseInvoiceDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5355312113746768281L;

	/** 
	 * 跟踪trace
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 消息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 发票详情
	 */
	@ApiListField("query_invoice_details")
	@ApiField("query_invoice_detail")
	private List<QueryInvoiceDetail> queryInvoiceDetails;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setQueryInvoiceDetails(List<QueryInvoiceDetail> queryInvoiceDetails) {
		this.queryInvoiceDetails = queryInvoiceDetails;
	}
	public List<QueryInvoiceDetail> getQueryInvoiceDetails( ) {
		return this.queryInvoiceDetails;
	}

}
