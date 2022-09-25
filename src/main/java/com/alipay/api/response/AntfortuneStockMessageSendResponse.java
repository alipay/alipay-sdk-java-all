package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-13 14:58:33
 */
public class AntfortuneStockMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7658824947278888549L;

	/** 
	 * 用户未签约
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * traceId、用来唯一定位某次调用，方便问题排查
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
