package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:53:52
 */
public class KoubeiContentContentinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5833352714535867287L;

	/** 
	 * 内容id
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
