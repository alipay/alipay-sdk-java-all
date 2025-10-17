package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:34:08
 */
public class KoubeiContentContentinfoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3727563413854883249L;

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
