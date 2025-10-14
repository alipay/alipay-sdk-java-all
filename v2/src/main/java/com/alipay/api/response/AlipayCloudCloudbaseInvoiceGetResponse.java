package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PreInvoiceData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 15:07:36
 */
public class AlipayCloudCloudbaseInvoiceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6245244465914865225L;

	/** 
	 * 开票记录uuid
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 跟踪trace
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 预览发票数据
	 */
	@ApiListField("invoice_datas")
	@ApiField("pre_invoice_data")
	private List<PreInvoiceData> invoiceDatas;

	/** 
	 * 消息
	 */
	@ApiField("message")
	private String message;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setInvoiceDatas(List<PreInvoiceData> invoiceDatas) {
		this.invoiceDatas = invoiceDatas;
	}
	public List<PreInvoiceData> getInvoiceDatas( ) {
		return this.invoiceDatas;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
