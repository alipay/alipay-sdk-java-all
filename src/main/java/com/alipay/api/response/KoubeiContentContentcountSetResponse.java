package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentcount.set response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-15 10:40:01
 */
public class KoubeiContentContentcountSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356868685866658919L;

	/** 
	 * 口碑内容的唯一id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 全链路唯一id,由服务系统提供
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
