package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.advance.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 13:58:09
 */
public class AlipayContentLiveAdvanceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5866871573197818425L;

	/** 
	 * 支付宝直播预告id，脱敏返回
	 */
	@ApiField("alipay_advance_id")
	private String alipayAdvanceId;

	/** 
	 * 日志链路id
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	public void setAlipayAdvanceId(String alipayAdvanceId) {
		this.alipayAdvanceId = alipayAdvanceId;
	}
	public String getAlipayAdvanceId( ) {
		return this.alipayAdvanceId;
	}

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

}
