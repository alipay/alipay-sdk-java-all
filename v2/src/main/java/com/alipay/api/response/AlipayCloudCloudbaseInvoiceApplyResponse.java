package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 15:02:29
 */
public class AlipayCloudCloudbaseInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3433588573292745914L;

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

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
