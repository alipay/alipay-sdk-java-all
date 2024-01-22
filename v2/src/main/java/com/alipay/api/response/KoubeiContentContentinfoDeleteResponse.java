package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:13:13
 */
public class KoubeiContentContentinfoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4148864277648148397L;

	/** 
	 * 口碑内容的唯一id
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 全链路Id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
