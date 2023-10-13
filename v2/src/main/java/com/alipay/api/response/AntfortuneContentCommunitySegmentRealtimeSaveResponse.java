package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.segment.realtime.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:26:52
 */
public class AntfortuneContentCommunitySegmentRealtimeSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4623594435181912578L;

	/** 
	 * 返回结果示例
	 */
	@ApiField("result")
	private String result;

	/** 
	 * trace信息，方便排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
